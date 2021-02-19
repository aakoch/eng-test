package com.adamkoch.garmin.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SecureElement {

  public Object secureElementId;
  public Object casdCert;
  public Object manufacturer;

  @Override
  public String toString() {
    return "SecureElement{" +
        "secureElementId=" + secureElementId +
        ", casdCert=" + casdCert +
        ", manufacturer=" + manufacturer +
        '}';
  }
}
