package com.oyo.OYO.Extension.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Action {

  OPEN(0, "open"),
  CHANGED(1, "changed"),
  CLOSED(2, "closed");

  private int id;
  private String action;
}
