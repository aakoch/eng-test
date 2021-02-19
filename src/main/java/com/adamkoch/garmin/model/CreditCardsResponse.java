package com.adamkoch.garmin.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.springframework.hateoas.RepresentationModel;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditCardsResponse extends RepresentationModel {

  @JsonProperty("totalResults")
  private int totalResults;

  @JsonProperty("offset")
  private int offset;

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
