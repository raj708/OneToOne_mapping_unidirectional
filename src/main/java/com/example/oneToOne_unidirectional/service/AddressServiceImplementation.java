package com.example.oneToOne_unidirectional.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oneToOne_unidirectional.entity.Address;
import com.example.oneToOne_unidirectional.repository.AddressRepository;

@Service
public class AddressServiceImplementation implements AddressService{

	@Autowired
	AddressRepository aRepo;
	@Override
	public Address saveAddress(Address address) {
		
		return aRepo.save(address);
	}
     
}
