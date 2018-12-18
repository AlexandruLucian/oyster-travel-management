package com.oyster.service;

import org.springframework.stereotype.Service;

import com.oyster.api.model.OysterCardModel;
import com.oyster.api.model.TravelModel;

@Service
public class OysterService {
	
	public OysterCardModel getCardById(Long id) {
		
		OysterCardModel card = new OysterCardModel();
		
		return card;
	}
	
	public TravelModel recordTravel(TravelModel travel) {
		return travel;
	}

}
