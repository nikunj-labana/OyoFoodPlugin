package com.oyo.OYO.Extension.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Object_type {

  TRANSACTION(0, "transaction");

  private int id;
  private String value;
}
