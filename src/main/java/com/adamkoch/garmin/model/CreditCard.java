package com.adamkoch.garmin.model;

import com.adamkoch.garmin.model.generated.CardMetaData;
import com.adamkoch.garmin.model.generated.EncryptedData;
import com.adamkoch.garmin.model.generated.TermsAssetReferencesItem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.springframework.hateoas.RepresentationModel;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditCard extends RepresentationModel {

  @JsonProperty("createdTsEpoch")
  private long createdTsEpoch;

  @JsonProperty("tokenLastFour")
  private String tokenLastFour;

  @JsonProperty("externalTokenReference")
  private String externalTokenReference;

  @JsonProperty("deviceRelationships")
  private List<Object> deviceRelationships;

  @JsonProperty("notEligibleReasons")
  private List<Object> notEligibleReasons;

  @JsonProperty("cardType")
  private String cardType;

  @JsonProperty("creditCardId")
  private String creditCardId;

  @JsonProperty("termsAssetId")
  private String termsAssetId;

  @JsonProperty("lastModifiedTsEpoch")
  private long lastModifiedTsEpoch;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("createdTs")
  private String createdTs;

  @JsonProperty("lastModifiedTs")
  private String lastModifiedTs;

  @JsonProperty("eligibilityExpirationEpoch")
  private long eligibilityExpirationEpoch;

  @JsonProperty("targetDeviceType")
  private String targetDeviceType;

  @JsonProperty("targetDeviceId")
  private String targetDeviceId;

  @JsonProperty("termsAssetReferences")
  private List<TermsAssetReferencesItem> termsAssetReferences;

  @JsonProperty("encryptedData")
  private EncryptedData encryptedData;

  @JsonProperty("state")
  private String state;

  @JsonProperty("cardMetaData")
  private CardMetaData cardMetaData;

  @JsonProperty("eligibilityExpiration")
  private String eligibilityExpiration;

  public CardMetaData getCardMetaData() {
    return cardMetaData;
  }

  public void setCardMetaData(CardMetaData cardMetaData) {
    this.cardMetaData = cardMetaData;
  }

  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public String getCreatedTs() {
    return createdTs;
  }

  public void setCreatedTs(String createdTs) {
    this.createdTs = createdTs;
  }

  public long getCreatedTsEpoch() {
    return createdTsEpoch;
  }

  public void setCreatedTsEpoch(long createdTsEpoch) {
    this.createdTsEpoch = createdTsEpoch;
  }

  public String getCreditCardId() {
    return creditCardId;
  }

  public void setCreditCardId(String creditCardId) {
    this.creditCardId = creditCardId;
  }

  public List<Object> getDeviceRelationships() {
    return deviceRelationships;
  }

  public void setDeviceRelationships(List<Object> deviceRelationships) {
    this.deviceRelationships = deviceRelationships;
  }

  public String getEligibilityExpiration() {
    return eligibilityExpiration;
  }

  public void setEligibilityExpiration(String eligibilityExpiration) {
    this.eligibilityExpiration = eligibilityExpiration;
  }

  public long getEligibilityExpirationEpoch() {
    return eligibilityExpirationEpoch;
  }

  public void setEligibilityExpirationEpoch(long eligibilityExpirationEpoch) {
    this.eligibilityExpirationEpoch = eligibilityExpirationEpoch;
  }

  public EncryptedData getEncryptedData() {
    return encryptedData;
  }

  public void setEncryptedData(EncryptedData encryptedData) {
    this.encryptedData = encryptedData;
  }

  public String getExternalTokenReference() {
    return externalTokenReference;
  }

  public void setExternalTokenReference(String externalTokenReference) {
    this.externalTokenReference = externalTokenReference;
  }

  public String getLastModifiedTs() {
    return lastModifiedTs;
  }

  public void setLastModifiedTs(String lastModifiedTs) {
    this.lastModifiedTs = lastModifiedTs;
  }

  public long getLastModifiedTsEpoch() {
    return lastModifiedTsEpoch;
  }

  public void setLastModifiedTsEpoch(long lastModifiedTsEpoch) {
    this.lastModifiedTsEpoch = lastModifiedTsEpoch;
  }

  public List<Object> getNotEligibleReasons() {
    return notEligibleReasons;
  }

  public void setNotEligibleReasons(List<Object> notEligibleReasons) {
    this.notEligibleReasons = notEligibleReasons;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getTargetDeviceId() {
    return targetDeviceId;
  }

  public void setTargetDeviceId(String targetDeviceId) {
    this.targetDeviceId = targetDeviceId;
  }

  public String getTargetDeviceType() {
    return targetDeviceType;
  }

  public void setTargetDeviceType(String targetDeviceType) {
    this.targetDeviceType = targetDeviceType;
  }

  public String getTermsAssetId() {
    return termsAssetId;
  }

  public void setTermsAssetId(String termsAssetId) {
    this.termsAssetId = termsAssetId;
  }

  public List<TermsAssetReferencesItem> getTermsAssetReferences() {
    return termsAssetReferences;
  }

  public void setTermsAssetReferences(List<TermsAssetReferencesItem> termsAssetReferences) {
    this.termsAssetReferences = termsAssetReferences;
  }

  public String getTokenLastFour() {
    return tokenLastFour;
  }

  public void setTokenLastFour(String tokenLastFour) {
    this.tokenLastFour = tokenLastFour;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
}
