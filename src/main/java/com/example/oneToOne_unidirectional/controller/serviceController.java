package com.example.oneToOne_unidirectional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.oneToOne_unidirectional.entity.Address;
import com.example.oneToOne_unidirectional.entity.Person;
import com.example.oneToOne_unidirectional.service.AddressService;
import com.example.oneToOne_unidirectional.service.PersonService;

@RestController
public class serviceController {
	@Autowired
	PersonService pService;
	@Autowired
	AddressService aService;
	
	@PostMapping("/addDetails")
	Person addDetails(@RequestBody Person person) {
		return pService.savePerson(person);
		
	}
	
	@PostMapping("/addAddress")
	Address addAddress(@RequestBody Address address) {
		return aService.saveAddress(address);
		
	}
	

}
