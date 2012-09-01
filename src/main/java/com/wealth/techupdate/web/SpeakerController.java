package com.wealth.techupdate.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wealth.techupdate.web.entity.Speaker;
import com.wealth.techupdate.web.repository.SpeakerRepository;

@RequestMapping("/speaker/**")
@Controller
public class SpeakerController {
	
	@Autowired private SpeakerRepository speakerRepository;

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<String> put(@RequestBody String body) {
    	Speaker speaker = Speaker.fromJsonToSpeaker(body);
    	speaker = speakerRepository.save(speaker);
    	String json = speaker.toJson();
    	HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        return new ResponseEntity<String>(json, headers, HttpStatus.CREATED);
    }

    @RequestMapping
    public String index() {
        return "speaker/index";
    }
}
