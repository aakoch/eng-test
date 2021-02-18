package com.adamkoch.garmin.model;

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
