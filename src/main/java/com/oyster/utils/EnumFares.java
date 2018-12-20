package com.oyster.utils;

import java.math.BigDecimal;

public enum EnumFares {
	
	ONE_ONE(1,1,BigDecimal.valueOf(2.5d)),
	ONE_TWO(1,2, BigDecimal.valueOf(3d));
	
	private int startZone;
	
	private int endZone;
	
	private BigDecimal fare;

	private EnumFares(int startZone, int endZone, BigDecimal fare) {
		this.startZone = startZone;
		this.endZone = endZone;
		this.fare = fare;
	}

	public int getStartZone() {
		return startZone;
	}

	public int getEndZone() {
		return endZone;
	}

	public BigDecimal getFare() {
		return fare;
	}
}
