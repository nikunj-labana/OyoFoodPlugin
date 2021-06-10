package com.oyo.OYO.Extension.service;

import com.oyo.OYO.Extension.enums.Action;
import com.oyo.OYO.Extension.enums.Object_type;
import com.oyo.OYO.Extension.model.OrderEntity;
import com.oyo.OYO.Extension.model.ProductDetails;
import com.oyo.OYO.Extension.model.Transaction;
import com.oyo.OYO.Extension.model.TransactionDetails;
import com.oyo.OYO.Extension.util.IGson;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Service
public class PosterNotificationProcessor {

  @Autowired
  private IGson iGson;

  @Autowired
  private ExternalPosterCalls posterService;

  @Autowired
  private ExternalOyoCalls oyoService;

  public Boolean processNotification(JSONObject request) {
    Transaction transaction = new Transaction();
    ProductDetails productDetails = new ProductDetails();

    if (Objects.isNull(request)) {
      return Boolean.FALSE;
    }
    String json = iGson.toJson(request);
    OrderEntity orderEntity = iGson.fromJson(json, OrderEntity.class);

    if (Object_type.TRANSACTION.getValue().equals(orderEntity.getObject())
        && Action.CLOSED.getAction().equals(orderEntity.getAction())) {
      transaction = posterService.getTransactionDetails(orderEntity.getObject_id());
      if (isOyoBooking(transaction.getTransaction_comment())) {
        productDetails = posterService.getProudctDetails(orderEntity.getObject_id());

        // calling OYO service for creating order againest booking ID
        oyoService.CreateOrder(transaction, productDetails);
      }
    }


    return true;
  }

  private boolean isOyoBooking(String transaction_comment) {
    String booking_id = transaction_comment.toUpperCase();
    if (booking_id.startsWith("OYO")) {
      return true;
    }
    return false;
  }

}
