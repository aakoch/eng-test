package com.adamkoch.garmin.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import org.springframework.hateoas.RepresentationModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Device extends RepresentationModel {

  @JsonAlias("_links")
  @JsonIgnore
  private Map links;

  private String deviceIdentifier;
  private String deviceType;
  private String manufacturerName;
  private String deviceName;
  private String createdTs;
  private long createdTsEpoch;
  private String osName;
  private List<String> cardRelationships;
  private SecureElement secureElement;
  private List<String> capabilities;
  private String SE_CONTACTLESS_PAYMENT;
  private String systemId;
  private String lastStateTransitionReasonCode;
  private String lastStateTransitionReasonMessage;
  private String state;
  private String id;

  public static void main(String[] args) throws IOException {
    final String s = Files.readString(Path.of("src/test/resources/devices.json"));

    ObjectMapper mapper = new ObjectMapper();
    final DeviceResponse deviceResponse = mapper.readValue(s, DeviceResponse.class);
    System.out.println("deviceResponse = " + deviceResponse);
  }

  public List<String> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(final List<String> capabilities) {
    this.capabilities = capabilities;
  }

  public List<String> getCardRelationships() {
    return cardRelationships;
  }

  public void setCardRelationships(final List<String> cardRelationships) {
    this.cardRelationships = cardRelationships;
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

  public String getDeviceIdentifier() {
    return deviceIdentifier;
  }

  public void setDeviceIdentifier(final String deviceIdentifier) {
    this.deviceIdentifier = deviceIdentifier;
  }

  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(final String deviceName) {
    this.deviceName = deviceName;
  }

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(final String deviceType) {
    this.deviceType = deviceType;
  }

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getLastStateTransitionReasonCode() {
    return lastStateTransitionReasonCode;
  }

  public void setLastStateTransitionReasonCode(final String lastStateTransitionReasonCode) {
    this.lastStateTransitionReasonCode = lastStateTransitionReasonCode;
  }

  public String getLastStateTransitionReasonMessage() {
    return lastStateTransitionReasonMessage;
  }

  public void setLastStateTransitionReasonMessage(final String lastStateTransitionReasonMessage) {
    this.lastStateTransitionReasonMessage = lastStateTransitionReasonMessage;
  }

  public String getManufacturerName() {
    return manufacturerName;
  }

  public void setManufacturerName(final String manufacturerName) {
    this.manufacturerName = manufacturerName;
  }

  public String getOsName() {
    return osName;
  }

  public void setOsName(final String osName) {
    this.osName = osName;
  }

  public String getSE_CONTACTLESS_PAYMENT() {
    return SE_CONTACTLESS_PAYMENT;
  }

  public void setSE_CONTACTLESS_PAYMENT(final String SE_CONTACTLESS_PAYMENT) {
    this.SE_CONTACTLESS_PAYMENT = SE_CONTACTLESS_PAYMENT;
  }

  public SecureElement getSecureElement() {
    return secureElement;
  }

  public void setSecureElement(final SecureElement secureElement) {
    this.secureElement = secureElement;
  }

  public String getState() {
    return state;
  }

  public void setState(final String state) {
    this.state = state;
  }

  public String getSystemId() {
    return systemId;
  }

  public void setSystemId(final String systemId) {
    this.systemId = systemId;
  }

  @Override
  public String toString() {
    return "Device{" +
        ", deviceIdentifier='" + deviceIdentifier + '\'' +
        ", deviceType='" + deviceType + '\'' +
        ", manufacturerName='" + manufacturerName + '\'' +
        ", deviceName='" + deviceName + '\'' +
        ", createdTs='" + createdTs + '\'' +
        ", createdTsEpoch=" + createdTsEpoch +
        ", osName='" + osName + '\'' +
        ", cardRelationships='" + cardRelationships + '\'' +
        ", secureElement=" + secureElement +
        ", capabilities=" + capabilities +
        ", SE_CONTACTLESS_PAYMENT='" + SE_CONTACTLESS_PAYMENT + '\'' +
        ", systemId='" + systemId + '\'' +
        ", lastStateTransitionReasonCode='" + lastStateTransitionReasonCode + '\'' +
        ", lastStateTransitionReasonMessage='" + lastStateTransitionReasonMessage + '\'' +
        ", state='" + state + '\'' +
        ", id='" + id + '\'' +
        '}';
  }
}
