package com.oyster.api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oyster.api.model.OysterCardModel;
import com.oyster.api.model.TravelModel;
import com.oyster.service.OysterService;

@RestController
public class OysterController {
	
	@Autowired
	private OysterService oysterService;
	
	@RequestMapping(value = "/oyster/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<OysterCardModel> getOysterCard(@PathVariable Long id) {

		OysterCardModel result = oysterService.getCardById(id);
		return new ResponseEntity<OysterCardModel>(result, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/oyster", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<TravelModel> recordTravel(@RequestBody TravelModel travel) {

		TravelModel result = oysterService.recordTravel(travel);
		return new ResponseEntity<TravelModel>(result, HttpStatus.OK);
	}
}
