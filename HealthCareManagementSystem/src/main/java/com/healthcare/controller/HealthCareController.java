package com.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.model.Person;
import com.healthcare.service.HealthCareService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value="/HealthCareSystem" )
public class HealthCareController {
	@Autowired HealthCareService service;
	
	@PostMapping(value = "/register")
	public boolean register(@RequestBody Person person){
		return service.register(person);
	}
}
