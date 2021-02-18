package com.adamkoch.garmin.model.generated;

import com.adamkoch.garmin.model.Links;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CardBackgroundCombinedEmbossedItem {

  @JsonProperty("_links")
  private Links links;

  @JsonProperty("width")
  private String width;

  @JsonProperty("mimeType")
  private String mimeType;

  @JsonProperty("height")
  private String height;

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

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

  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }
}
