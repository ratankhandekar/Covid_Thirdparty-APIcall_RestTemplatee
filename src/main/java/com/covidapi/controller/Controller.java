package com.covidapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covidapi.service.Services;

@RestController
public class Controller {
	@Autowired
	 Services service;
	



	@GetMapping("/")
	public String getData()
	{
		return service.consumAPI();
	}
		
}
