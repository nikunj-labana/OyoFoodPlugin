package com.oyo.OYO.Extension.util;

import org.springframework.stereotype.Component;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

@Component
public class DefaultGson implements IGson {

  private final Gson gson = new Gson();

  @Override
  public <T> T fromJson(String json, Class<T> classOfT) throws JsonSyntaxException {
    return gson.fromJson(json, classOfT);
  }

  @Override
  public String toJson(Object src) {
    return gson.toJson(src);
  }

}
