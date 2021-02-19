package com.adamkoch.garmin.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(Include.NON_NULL)
public class CreditCardsResponse {

  @JsonProperty("totalResults")
  private int totalResults;

  @JsonProperty("offset")
  private int offset;

  @JsonProperty("_links")
  private Links links;

  @JsonProperty("limit")
  private int limit;

  @JsonProperty("results")
  private List<CreditCard> results;

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

  public List<CreditCard> getResults() {
    return results;
  }

  public void setResults(List<CreditCard> results) {
    this.results = results;
  }

  public int getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(int totalResults) {
    this.totalResults = totalResults;
  }
}
