package com.sapient.interview.cricket.controller;

import com.sapient.interview.cricket.exceptionalhandling.ResourceNotFoundException;
import com.sapient.interview.cricket.model.Response;
import com.sapient.interview.cricket.service.CricketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cricketmatch")
public class CricketController {
	
	@Autowired
    CricketService cricketService;
	
	@RequestMapping("/status")
	public Response getMatchDetails(@RequestParam("unique_id") String uniqueId ) throws ResourceNotFoundException{
		
		return cricketService.getMatchDetails(uniqueId);
	}
	

}
