package com.oyo.OYO.Extension.service;

import com.oyo.OYO.Extension.model.ProductDetails;
import com.oyo.OYO.Extension.model.Transaction;
import com.oyo.OYO.Extension.model.TransactionDetails;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Component
public class ExternalPosterCalls {

  @Value("${poster.access_token}")
  private String token;

  @Value("${poster.base_url}")
  private String posterUrl;

  @Value("${poster.get_transaction_path}")
  private String getTxnPath;

  @Value("${poster.get_transaction_products_path}")
  private String getTxnProductPath;

  public ProductDetails getProudctDetails(String transactionId) {
    ProductDetails productDetails = new ProductDetails();
    String posterBaseUrl =
        posterUrl + getTxnProductPath + "?token=" + token + "&transaction_id=" + transactionId;
    HttpEntity<?> requestEntity = new HttpEntity<>(new JSONObject());
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<ProductDetails> productDetailsEntity = null;
    try {
      productDetailsEntity =
          restTemplate.exchange(posterBaseUrl, HttpMethod.GET, requestEntity, ProductDetails.class);
    } catch (RestClientException e) {

    }
    if (Objects.nonNull(productDetailsEntity)
        && productDetailsEntity.getStatusCode().equals(HttpStatus.OK)) {
      productDetails = productDetailsEntity.getBody();
    }
    return productDetails;
  }


  public Transaction getTransactionDetails(String transactionId) {

    Transaction transaction = new Transaction();
    String posterBaseUrl =
        posterUrl + getTxnPath + "?token=" + token + "&transaction_id=" + transactionId;
    HttpEntity<?> requestEntity = new HttpEntity<>(new JSONObject());
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<TransactionDetails> transactionDetails = null;

    try {
      transactionDetails = restTemplate.exchange(posterBaseUrl, HttpMethod.GET, requestEntity,
          TransactionDetails.class);
    } catch (RestClientException e) {

    }

    if (Objects.nonNull(transactionDetails)
        && transactionDetails.getStatusCode().equals(HttpStatus.OK)) {
      transaction = transactionDetails.getBody().getResponse().get(0);
    }

    return transaction;
  }

}
