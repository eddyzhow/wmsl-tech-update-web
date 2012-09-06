package com.wealth.techupdate.web.entity;

import flexjson.JSONDeserializer;
import flexjson.transformer.DateTransformer;

import java.util.Date;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
public class Day {
	private Date date;
	private String remark;

	public static Day fromJsonToDay(String json) {
        return new JSONDeserializer<Day>()
        		.use(new DateTransformer("dd/MM/yyyy"), "date")
        		.use(null, Day.class).deserialize(json);
    }
}
