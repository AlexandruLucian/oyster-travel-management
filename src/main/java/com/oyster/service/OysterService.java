package com.oyster.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.oyster.api.dao.OysterRepository;
import com.oyster.api.model.OysterCardModel;
import com.oyster.api.model.TravelModel;
import com.oyster.utils.EnumFares;

@Service
public class OysterService {

	@Value("${spring.datasource.url}")
	private String derbyDatasourceUrl;

	@Autowired
	private OysterRepository oysterRepository;

	public static final BigDecimal BUS_FARE = BigDecimal.valueOf(1.8d);

	public static final BigDecimal MAXIMUM_FARE = BigDecimal.valueOf(3.2d);

	public OysterCardModel getCardById(Long id) {

		OysterCardModel card = new OysterCardModel(id, null, false, 0);

		return card;
	}

	public OysterCardModel recordTravel(TravelModel travel) {
		OysterCardModel card = oysterRepository.findById(travel.getCardId()).get();

		if (travel.isBus()) {
			BigDecimal newBalance = card.getBalance().subtract(BUS_FARE);
			card.setBalance(newBalance);
		} else if (travel.isStarting()) {
			resolveStartTravel(card, travel);
		} else {
			resolveEndTravel(card, travel);
		}
		oysterRepository.save(card);
		return card;
	}

	private void resolveStartTravel(OysterCardModel card, TravelModel travel) {
		BigDecimal newBalance = card.getBalance().subtract(MAXIMUM_FARE);
		card.setLastRecordedZone(travel.getZone());
		card.setInUse(true);
		card.setBalance(newBalance);
	}

	private void resolveEndTravel(OysterCardModel card, TravelModel travel) {
		if (card.isInUse()) {
			BigDecimal newBalance = card.getBalance().add(MAXIMUM_FARE)
					.subtract(resolveTravelFare(card.getLastRecordedZone(), travel.getZone()));
			card.setBalance(newBalance);
			card.setInUse(false);
		}
	}

	private BigDecimal resolveTravelFare(int travelStartZone, int travelEndZone) {
		for (EnumFares enumFare : EnumFares.values()) {
			if (enumFare.getStartZone() == travelStartZone && enumFare.getEndZone() == travelEndZone) {
				return enumFare.getFare();
			}
		}
		return BigDecimal.valueOf(0d);
	}
}
