package com.covidapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.covidapi.Dto.CovidDetails;

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

	public CovidDetails consumAPI2()
	{
		return restTemplate.getForObject("https://dummyjson.com/products/1", 
				CovidDetails.class);
	}


}
