package com.adamkoch.garmin.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.hateoas.RepresentationModel;

public class Device extends RepresentationModel {

  private static final Logger LOGGER = LogManager.getLogger(Device.class);

  @JsonAlias("_links")
  public Map links;
  public String deviceIdentifier;
  public Object deviceType;
  public Object manufacturerName;
  public Object deviceName;
  public Object createdTs;
  public Object createdTsEpoch;
  public Object osName;
  public Object cardRelationships;
  public SecureElement secureElement;
  public List<String> capabilities;
  public Object SE_CONTACTLESS_PAYMENT;
  public Object systemId;
  public Object lastStateTransitionReasonCode;
  public Object lastStateTransitionReasonMessage;
  private String state;
  private String id;

  public static void main(String[] args) throws IOException {
    final String s = Files.readString(Path.of("/Users/aakoch/projects/garmin/src/test/resources/devices.json"));

    ObjectMapper mapper = new ObjectMapper();
    final DeviceResponse deviceResponse = mapper.readValue(s, DeviceResponse.class);
    System.out.println("deviceResponse = " + deviceResponse);
  }

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getState() {
    return state;
  }

  public void setState(final String state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "DeviceResult{" +
        "links=" + links +
        ", deviceIdentifier='" + deviceIdentifier + '\'' +
        ", deviceType=" + deviceType +
        ", state=" + state +
        ", manufacturerName=" + manufacturerName +
        ", deviceName=" + deviceName +
        ", createdTs=" + createdTs +
        ", createdTsEpoch=" + createdTsEpoch +
        ", osName=" + osName +
        ", cardRelationships=" + cardRelationships +
        ", secureElement=" + secureElement +
        ", capabilities=" + capabilities +
        ", SE_CONTACTLESS_PAYMENT=" + SE_CONTACTLESS_PAYMENT +
        ", systemId=" + systemId +
        ", lastStateTransitionReasonCode=" + lastStateTransitionReasonCode +
        ", lastStateTransitionReasonMessage=" + lastStateTransitionReasonMessage +
        '}';
  }
}
