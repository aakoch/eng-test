package com.adamkoch.garmin.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EncryptedData {

  @JsonProperty("encryptedDataSkipped")
  private String encryptedDataSkipped;

  public String getEncryptedDataSkipped() {
    return encryptedDataSkipped;
  }

  public void setEncryptedDataSkipped(String encryptedDataSkipped) {
    this.encryptedDataSkipped = encryptedDataSkipped;
  }
}
