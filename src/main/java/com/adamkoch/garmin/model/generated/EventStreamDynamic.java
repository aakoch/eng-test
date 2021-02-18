package com.adamkoch.garmin.model.generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventStreamDynamic {

  @JsonProperty("templated")
  private boolean templated;

  @JsonProperty("href")
  private String href;

  public String getHref() {
    return href;
  }

  public boolean isTemplated() {
    return templated;
  }
}
