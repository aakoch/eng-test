package com.adamkoch.garmin.model.generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
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
