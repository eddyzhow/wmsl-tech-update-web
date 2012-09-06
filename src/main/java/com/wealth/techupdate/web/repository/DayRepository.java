package com.wealth.techupdate.web.repository;

import com.wealth.techupdate.web.entity.Day;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Day.class)
public interface DayRepository {

    List<com.wealth.techupdate.web.entity.Day> findAll();
}
