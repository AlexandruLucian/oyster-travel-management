package com.oyster.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.oyster.api.model.TravelModel;

public interface OysterRepository extends CrudRepository<TravelModel, Long> {
}
