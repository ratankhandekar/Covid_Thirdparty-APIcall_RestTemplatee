package com.covidapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covidapi.Dto.CovidDetails;
import com.covidapi.service.Services;
//controller
@RestController
public class Controller {
	@Autowired
	Services service;
//this is what
	
	//give result in TEXT formatt:index file added
	@GetMapping("/")
	String add()
	{
		return service.consumAPI();
	}

	//result in JSON formatt:dwcwc
	@GetMapping("a")
	ResponseEntity<CovidDetails> getData() {

		return new ResponseEntity<>(service.consumAPI2(), HttpStatus.OK);
	}

}
