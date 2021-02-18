package com.adamkoch.garmin.services;

public class ServiceException extends RuntimeException {

  public ServiceException(final String message) {
    super(message);
  }
}
