package com.adamkoch.garmin.model.generated;

import com.adamkoch.garmin.model.Links;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TermsAssetReferencesItem {

  @JsonProperty("_links")
  private Links links;

  @JsonProperty("mimeType")
  private String mimeType;

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }
}
