package com.adamkoch.garmin.model;

import com.adamkoch.garmin.model.generated.CardMetaData;
import com.adamkoch.garmin.model.generated.EncryptedData;
import com.adamkoch.garmin.model.generated.TermsAssetReferencesItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CreditCard{

	@JsonProperty("createdTsEpoch")
	private long createdTsEpoch;

	@JsonProperty("tokenLastFour")
	private String tokenLastFour;

	@JsonProperty("externalTokenReference")
	private String externalTokenReference;

	@JsonProperty("_links")
	private Links links;

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

	public void setCreatedTsEpoch(long createdTsEpoch){
		this.createdTsEpoch = createdTsEpoch;
	}

	public long getCreatedTsEpoch(){
		return createdTsEpoch;
	}

	public void setTokenLastFour(String tokenLastFour){
		this.tokenLastFour = tokenLastFour;
	}

	public String getTokenLastFour(){
		return tokenLastFour;
	}

	public void setExternalTokenReference(String externalTokenReference){
		this.externalTokenReference = externalTokenReference;
	}

	public String getExternalTokenReference(){
		return externalTokenReference;
	}

	public void setLinks(Links links){
		this.links = links;
	}

	public Links getLinks(){
		return links;
	}

	public void setDeviceRelationships(List<Object> deviceRelationships){
		this.deviceRelationships = deviceRelationships;
	}

	public List<Object> getDeviceRelationships(){
		return deviceRelationships;
	}

	public void setNotEligibleReasons(List<Object> notEligibleReasons){
		this.notEligibleReasons = notEligibleReasons;
	}

	public List<Object> getNotEligibleReasons(){
		return notEligibleReasons;
	}

	public void setCardType(String cardType){
		this.cardType = cardType;
	}

	public String getCardType(){
		return cardType;
	}

	public void setCreditCardId(String creditCardId){
		this.creditCardId = creditCardId;
	}

	public String getCreditCardId(){
		return creditCardId;
	}

	public void setTermsAssetId(String termsAssetId){
		this.termsAssetId = termsAssetId;
	}

	public String getTermsAssetId(){
		return termsAssetId;
	}

	public void setLastModifiedTsEpoch(long lastModifiedTsEpoch){
		this.lastModifiedTsEpoch = lastModifiedTsEpoch;
	}

	public long getLastModifiedTsEpoch(){
		return lastModifiedTsEpoch;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return userId;
	}

	public void setCreatedTs(String createdTs){
		this.createdTs = createdTs;
	}

	public String getCreatedTs(){
		return createdTs;
	}

	public void setLastModifiedTs(String lastModifiedTs){
		this.lastModifiedTs = lastModifiedTs;
	}

	public String getLastModifiedTs(){
		return lastModifiedTs;
	}

	public void setEligibilityExpirationEpoch(long eligibilityExpirationEpoch){
		this.eligibilityExpirationEpoch = eligibilityExpirationEpoch;
	}

	public long getEligibilityExpirationEpoch(){
		return eligibilityExpirationEpoch;
	}

	public void setTargetDeviceType(String targetDeviceType){
		this.targetDeviceType = targetDeviceType;
	}

	public String getTargetDeviceType(){
		return targetDeviceType;
	}

	public void setTargetDeviceId(String targetDeviceId){
		this.targetDeviceId = targetDeviceId;
	}

	public String getTargetDeviceId(){
		return targetDeviceId;
	}

	public void setTermsAssetReferences(List<TermsAssetReferencesItem> termsAssetReferences){
		this.termsAssetReferences = termsAssetReferences;
	}

	public List<TermsAssetReferencesItem> getTermsAssetReferences(){
		return termsAssetReferences;
	}

	public void setEncryptedData(EncryptedData encryptedData){
		this.encryptedData = encryptedData;
	}

	public EncryptedData getEncryptedData(){
		return encryptedData;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setCardMetaData(CardMetaData cardMetaData){
		this.cardMetaData = cardMetaData;
	}

	public CardMetaData getCardMetaData(){
		return cardMetaData;
	}

	public void setEligibilityExpiration(String eligibilityExpiration){
		this.eligibilityExpiration = eligibilityExpiration;
	}

	public String getEligibilityExpiration(){
		return eligibilityExpiration;
	}
}
