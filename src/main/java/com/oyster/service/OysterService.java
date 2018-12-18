package com.oyster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.oyster.api.dao.OysterRepository;
import com.oyster.api.model.OysterCardModel;
import com.oyster.api.model.TravelModel;

@Service
public class OysterService {
	
	@Value("${spring.datasource.url}")
    private String derbyDatasourceUrl;
	
	@Autowired
	private OysterRepository oysterRepository;
	
	public OysterCardModel getCardById(Long id) {
		
		OysterCardModel card = new OysterCardModel(id, null, false, 0);
		
		return card;
	}
	
	public TravelModel recordTravel(TravelModel travel) {
		oysterRepository.save(travel);
		return travel;
	}

}
