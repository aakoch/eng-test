package com.adamkoch.garmin.model.generated;

import com.adamkoch.garmin.model.Links;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CardMetaData {

  @JsonProperty("_links")
  private Links links;

  @JsonProperty("longDescription")
  private String longDescription;

  @JsonProperty("termsAndConditionsUrl")
  private String termsAndConditionsUrl;

  @JsonProperty("cardBackgroundCombined")
  private List<CardBackgroundCombinedItem> cardBackgroundCombined;

  @JsonProperty("contactEmail")
  private String contactEmail;

  @JsonProperty("issuerLogo")
  private List<IssuerLogoItem> issuerLogo;

  @JsonProperty("issuerName")
  private String issuerName;

  @JsonProperty("icon")
  private List<IconItem> icon;

  @JsonProperty("foregroundColor")
  private String foregroundColor;

  @JsonProperty("shortDescription")
  private String shortDescription;

  @JsonProperty("coBrandLogo")
  private List<CoBrandLogoItem> coBrandLogo;

  @JsonProperty("privacyPolicyUrl")
  private String privacyPolicyUrl;

  @JsonProperty("labelColor")
  private String labelColor;

  @JsonProperty("cardBackgroundCombinedEmbossed")
  private List<CardBackgroundCombinedEmbossedItem> cardBackgroundCombinedEmbossed;

  @JsonProperty("cardBackground")
  private List<CardBackgroundItem> cardBackground;

  @JsonProperty("contactUrl")
  private String contactUrl;

  @JsonProperty("contactPhone")
  private String contactPhone;

  @JsonProperty("brandLogo")
  private List<BrandLogoItem> brandLogo;

  public List<BrandLogoItem> getBrandLogo() {
    return brandLogo;
  }

  public void setBrandLogo(List<BrandLogoItem> brandLogo) {
    this.brandLogo = brandLogo;
  }

  public List<CardBackgroundItem> getCardBackground() {
    return cardBackground;
  }

  public void setCardBackground(List<CardBackgroundItem> cardBackground) {
    this.cardBackground = cardBackground;
  }

  public List<CardBackgroundCombinedItem> getCardBackgroundCombined() {
    return cardBackgroundCombined;
  }

  public void setCardBackgroundCombined(List<CardBackgroundCombinedItem> cardBackgroundCombined) {
    this.cardBackgroundCombined = cardBackgroundCombined;
  }

  public List<CardBackgroundCombinedEmbossedItem> getCardBackgroundCombinedEmbossed() {
    return cardBackgroundCombinedEmbossed;
  }

  public void setCardBackgroundCombinedEmbossed(
      List<CardBackgroundCombinedEmbossedItem> cardBackgroundCombinedEmbossed) {
    this.cardBackgroundCombinedEmbossed = cardBackgroundCombinedEmbossed;
  }

  public List<CoBrandLogoItem> getCoBrandLogo() {
    return coBrandLogo;
  }

  public void setCoBrandLogo(List<CoBrandLogoItem> coBrandLogo) {
    this.coBrandLogo = coBrandLogo;
  }

  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public String getContactPhone() {
    return contactPhone;
  }

  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }

  public String getContactUrl() {
    return contactUrl;
  }

  public void setContactUrl(String contactUrl) {
    this.contactUrl = contactUrl;
  }

  public String getForegroundColor() {
    return foregroundColor;
  }

  public void setForegroundColor(String foregroundColor) {
    this.foregroundColor = foregroundColor;
  }

  public List<IconItem> getIcon() {
    return icon;
  }

  public void setIcon(List<IconItem> icon) {
    this.icon = icon;
  }

  public List<IssuerLogoItem> getIssuerLogo() {
    return issuerLogo;
  }

  public void setIssuerLogo(List<IssuerLogoItem> issuerLogo) {
    this.issuerLogo = issuerLogo;
  }

  public String getIssuerName() {
    return issuerName;
  }

  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }

  public String getLabelColor() {
    return labelColor;
  }

  public void setLabelColor(String labelColor) {
    this.labelColor = labelColor;
  }

  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }

  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public String getTermsAndConditionsUrl() {
    return termsAndConditionsUrl;
  }

  public void setTermsAndConditionsUrl(String termsAndConditionsUrl) {
    this.termsAndConditionsUrl = termsAndConditionsUrl;
  }
}
