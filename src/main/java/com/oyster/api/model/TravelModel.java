package com.oyster.api.model;

public class TravelModel {
	
	private Long cardId;
	
	private boolean isStarting;
	
	private boolean isBus;
	
	private int zone;

	public Long getCardId() {
		return cardId;
	}

	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}

	public boolean isStarting() {
		return isStarting;
	}

	public void setStarting(boolean isStarting) {
		this.isStarting = isStarting;
	}

	public boolean isBus() {
		return isBus;
	}

	public void setBus(boolean isBus) {
		this.isBus = isBus;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}
}
