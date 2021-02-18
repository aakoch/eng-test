package com.adamkoch.garmin.model;

import com.adamkoch.garmin.model.generated.EncryptedData;
import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;
import java.util.Map;

public class UserResponse {

  @JsonAlias("_links")
  private Map links;
  private int limit;
  private int offset;
  private int totalResults;
  private List<Device> results;
  private String deviceIdentifier;
  private String deviceType;
  private String manufacturerName;
  private String deviceName;
  private String createdTs;
  private long createdTsEpoch;
  private String osName;
  private Object cardRelationships;
  private SecureElement secureElement;
  private List<String> capabilities;
  private String SE_CONTACTLESS_PAYMENT;
  private String systemId;
  private String lastStateTransitionReasonCode;
  private String lastStateTransitionReasonMessage;
  private String id;
  private String lastModifiedTs;
  private long lastModifiedTsEpoch;
  private EncryptedData encryptedData;
  private String state;
  private String userId;

  public String getUserId() {
    return userId;
  }

  public Map getLinks() {
    return links;
  }

  public void setLinks(final Map links) {
    this.links = links;
  }

  public int getLimit() {
    return limit;
  }

  public void setLimit(final int limit) {
    this.limit = limit;
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(final int offset) {
    this.offset = offset;
  }

  public int getTotalResults() {
    return totalResults;
  }

  public void setTotalResults(final int totalResults) {
    this.totalResults = totalResults;
  }

  public List<Device> getDevices() {
    return results;
  }

  public void setResults(final List<Device> results) {
    this.results = results;
  }

  public String getDeviceIdentifier() {
    return deviceIdentifier;
  }

  public void setDeviceIdentifier(final String deviceIdentifier) {
    this.deviceIdentifier = deviceIdentifier;
  }

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(final String deviceType) {
    this.deviceType = deviceType;
  }

  public String getManufacturerName() {
    return manufacturerName;
  }

  public void setManufacturerName(final String manufacturerName) {
    this.manufacturerName = manufacturerName;
  }

  public Object getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(final String deviceName) {
    this.deviceName = deviceName;
  }

  public String getCreatedTs() {
    return createdTs;
  }

  public void setCreatedTs(final String createdTs) {
    this.createdTs = createdTs;
  }

  public long getCreatedTsEpoch() {
    return createdTsEpoch;
  }

  public void setCreatedTsEpoch(final long createdTsEpoch) {
    this.createdTsEpoch = createdTsEpoch;
  }

  public String getOsName() {
    return osName;
  }

  public void setOsName(final String osName) {
    this.osName = osName;
  }

  public Object getCardRelationships() {
    return cardRelationships;
  }

  public void setCardRelationships(final Object cardRelationships) {
    this.cardRelationships = cardRelationships;
  }

  public SecureElement getSecureElement() {
    return secureElement;
  }

  public void setSecureElement(final SecureElement secureElement) {
    this.secureElement = secureElement;
  }

  public List<String> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(final List<String> capabilities) {
    this.capabilities = capabilities;
  }

  public Object getSE_CONTACTLESS_PAYMENT() {
    return SE_CONTACTLESS_PAYMENT;
  }

  public void setSE_CONTACTLESS_PAYMENT(final String SE_CONTACTLESS_PAYMENT) {
    this.SE_CONTACTLESS_PAYMENT = SE_CONTACTLESS_PAYMENT;
  }

  public Object getSystemId() {
    return systemId;
  }

  public void setSystemId(final String systemId) {
    this.systemId = systemId;
  }

  public Object getLastStateTransitionReasonCode() {
    return lastStateTransitionReasonCode;
  }

  public void setLastStateTransitionReasonCode(final String lastStateTransitionReasonCode) {
    this.lastStateTransitionReasonCode = lastStateTransitionReasonCode;
  }

  public Object getLastStateTransitionReasonMessage() {
    return lastStateTransitionReasonMessage;
  }

  public void setLastStateTransitionReasonMessage(final String lastStateTransitionReasonMessage) {
    this.lastStateTransitionReasonMessage = lastStateTransitionReasonMessage;
  }

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getLastModifiedTs() {
    return lastModifiedTs;
  }

  public void setLastModifiedTs(final String lastModifiedTs) {
    this.lastModifiedTs = lastModifiedTs;
  }

  public long getLastModifiedTsEpoch() {
    return lastModifiedTsEpoch;
  }

  public void setLastModifiedTsEpoch(final long lastModifiedTsEpoch) {
    this.lastModifiedTsEpoch = lastModifiedTsEpoch;
  }

  public EncryptedData getEncryptedData() {
    return encryptedData;
  }

  public void setEncryptedData(final EncryptedData encryptedData) {
    this.encryptedData = encryptedData;
  }

  public String getState() {
    return state;
  }

  public void setState(final String state) {
    this.state = state;
  }

  public void setUserId(final String userId) {
    this.userId = userId;
  }
}