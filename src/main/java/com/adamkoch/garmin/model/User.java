package com.adamkoch.garmin.model;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.hateoas.RepresentationModel;

public class User extends RepresentationModel {

  private static final Logger LOGGER = LogManager.getLogger(User.class);

  private String id;
  private List<CreditCard> creditCards;
  private List<Device> devices;

  public List<CreditCard> getCreditCards() {
    return creditCards;
  }

  public void setCreditCards(final List<CreditCard> creditCards) {
    this.creditCards = creditCards;
  }

  public List<Device> getDevices() {
    return devices;
  }

  public void setDevices(final List<Device> devices) {
    this.devices = devices;
  }

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        ", creditCards=" + creditCards +
        ", devices=" + devices +
        '}';
  }
}
