package com.oyster.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.oyster.api.model.OysterCardModel;

public interface OysterRepository extends CrudRepository<OysterCardModel, Long> {
}
