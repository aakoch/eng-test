package com.adamkoch.garmin.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Collections;
import java.util.List;

@JsonInclude(Include.NON_NULL)
public class DeviceResponse {

  @JsonAlias("_links")
  private Links links;
  private int limit;
  private int offset;
  private int totalResults;
  private List<Device> results;

  @JsonAlias("results")
  public List<Device> getDevices() {
    return Collections.unmodifiableList(results);
  }

  @JsonAlias("results")
  public void getDevices(List<Device> devices) {
    results = devices;
  }

  public int getLimit() {
    return limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
  }

  @JsonIgnore
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public int getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(int totalResults) {
    this.totalResults = totalResults;
  }

  @Override
  public String toString() {
    return "DeviceResponse{" +
        "links=" + links +
        ", limit=" + limit +
        ", offset=" + offset +
        ", totalResults=" + totalResults +
        ", results=" + results +
        '}';
  }
}
