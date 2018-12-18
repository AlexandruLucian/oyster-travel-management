package com.oyster.api.model;

import java.math.BigDecimal;

public class OysterCardModel {
	
	private Long cardId;
	
	private BigDecimal balance;
	
	private boolean inUse;
	
	private int lastRecordedZone;

	public Long getCardId() {
		return cardId;
	}

	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public boolean isInUse() {
		return inUse;
	}

	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}

	public int getLastRecordedZone() {
		return lastRecordedZone;
	}

	public void setLastRecordedZone(int lastRecordedZone) {
		this.lastRecordedZone = lastRecordedZone;
	}
}
