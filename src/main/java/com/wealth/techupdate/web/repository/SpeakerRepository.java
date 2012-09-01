package com.wealth.techupdate.web.repository;

import java.util.List;

import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

import com.wealth.techupdate.web.entity.Speaker;

@RooMongoRepository(domainType = Speaker.class)
public interface SpeakerRepository {
	public List<Speaker> findAll();
}
