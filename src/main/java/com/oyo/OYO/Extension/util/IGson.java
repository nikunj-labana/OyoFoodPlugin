package com.oyo.OYO.Extension.util;

import com.google.gson.JsonSyntaxException;

public interface IGson {

    <T> T fromJson(String json, Class<T> classOfT) throws JsonSyntaxException;

    String toJson(Object src);
}
