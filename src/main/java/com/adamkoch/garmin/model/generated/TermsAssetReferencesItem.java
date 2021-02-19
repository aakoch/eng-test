package com.adamkoch.garmin.model.generated;

import com.adamkoch.garmin.model.Links;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class TermsAssetReferencesItem {

  @JsonProperty("_links")
  private Links links;

  @JsonProperty("mimeType")
  private String mimeType;

  @JsonIgnore
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
