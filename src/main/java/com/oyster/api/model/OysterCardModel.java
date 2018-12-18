package com.oyster.api.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class OysterCardModel {
	
	@Id
	private Long cardId;
	
	private BigDecimal balance;
	
	private boolean inUse;
	
	private int lastRecordedZone;

	public OysterCardModel(Long cardId, BigDecimal balance, boolean inUse, int lastRecordedZone) {
		super();
		this.cardId = cardId;
		this.balance = balance;
		this.inUse = inUse;
		this.lastRecordedZone = lastRecordedZone;
	}

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
