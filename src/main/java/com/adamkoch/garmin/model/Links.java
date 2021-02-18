package com.adamkoch.garmin.model;

import com.adamkoch.garmin.model.generated.Self;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Links{

	@JsonProperty("self")
	private Self self;

	private Object webappCard;

	@JsonGetter("webapp.card")
	public Object getWebappCard() {
		return webappCard;
	}

	public void setSelf(Self self){
		this.self = self;
	}

	public Self getSelf(){
		return self;
	}

	@JsonSetter("webapp.card")
	public void setWebappCard(final Object webappCard) {
		this.webappCard = webappCard;
	}
}
