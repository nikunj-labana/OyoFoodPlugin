package com.oyo.OYO.Extension.service;

import com.oyo.OYO.Extension.enums.Currency;
import com.oyo.OYO.Extension.model.OrderRequestOYO;
import com.oyo.OYO.Extension.model.Product;
import com.oyo.OYO.Extension.model.ProductDetails;
import com.oyo.OYO.Extension.model.ProductsOYO;
import com.oyo.OYO.Extension.model.Transaction;
import com.oyo.OYO.Extension.model.TransactionDetails;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class ExternalOyoCalls {

  @Value("${OYO.base_url}")
  private String oyobaseurl;

  @Value("${create.order.path}")
  private String createOrderPath;


  public void CreateOrder(Transaction transaction, ProductDetails productDetails) {
    OrderRequestOYO orderRequestOYO = CreateOrderRequest(transaction, productDetails);
    String baseUrl = oyobaseurl + createOrderPath;
    HttpEntity<?> requestEntity = new HttpEntity<>(orderRequestOYO);
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> responseEntity;
    try {
      responseEntity = restTemplate.exchange(baseUrl, HttpMethod.POST, requestEntity, String.class);
    } catch (RestClientException e) {

    }

  }

  private OrderRequestOYO CreateOrderRequest(Transaction transaction,
      ProductDetails productDetails) {
    OrderRequestOYO orderRequestOYO = new OrderRequestOYO();
    List<ProductsOYO> productsOYOList = new ArrayList<>();
    for (Product product : productDetails.getResponse()) {
      ProductsOYO productsOYO = new ProductsOYO();
      Double amount =
          Double.parseDouble(product.getProduct_sum()) / Currency.INR.getMultiplicationFactor();
      productsOYO.setAmount(amount);
      productsOYO.setDescription(product.getProduct_name());
      productsOYO.setName(product.getProduct_name());
      productsOYOList.add(productsOYO);
    }
    orderRequestOYO.setProducts(productsOYOList);
    orderRequestOYO.setBookingId(transaction.getTransaction_comment());
    orderRequestOYO.setUserProfileId(transaction.getTransaction_comment());
    orderRequestOYO.setCurrency(Currency.INR);
    orderRequestOYO.setIsPaid(Boolean.FALSE);
    orderRequestOYO.setCategory("FOOD");
    orderRequestOYO.setName("Nikunj");
    orderRequestOYO.setEmail("nikunjlabana99@gmail.com");
    orderRequestOYO.setPhone("8094731005");
    return orderRequestOYO;
  }
}
