package com.stackroute.cvrp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.cvrp.domain.Logistics;
import com.stackroute.cvrp.service.CvrpService;

@RestController
@RequestMapping("api/v1/cvrp/")
public class CvrpController {

	private CvrpService cvrpService;
	@Autowired
	public CvrpController(CvrpService cvrpService) {

		this.cvrpService=cvrpService;
	}
	@GetMapping("/slot")
	public ResponseEntity<Logistics> getJson(){
//		Console.log(this.cvrpService.getJson());
	System.out.println(this.cvrpService.getJson());
		return new ResponseEntity<Logistics>(this.cvrpService.getJson(),HttpStatus.OK);
	}
	@PostMapping(value="/distancematrix",produces= {"application/json"})
	public ResponseEntity<?> distanceMatrix(){
		
	}
}
