package com.example.oneToOne_unidirectional.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oneToOne_unidirectional.entity.Person;
import com.example.oneToOne_unidirectional.repository.PersonRepository;

@Service
public class PersonServiceEmplementation implements PersonService {

	@Autowired
	PersonRepository pRepo;
	@Override
	public Person savePerson(Person person) {
		return pRepo.save(person);
		
	}

}
