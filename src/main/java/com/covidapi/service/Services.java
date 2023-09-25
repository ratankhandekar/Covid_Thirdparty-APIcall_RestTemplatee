package com.covidapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Services {
	private final RestTemplate restTemplate;

	@Autowired
	public Services(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public String consumAPI()
	{
		return restTemplate.getForObject("https://api.covidtracking.com/v1/us/current.json", 
				String.class);
	}

}
