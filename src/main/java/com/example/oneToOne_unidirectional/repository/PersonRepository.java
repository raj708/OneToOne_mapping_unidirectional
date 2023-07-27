package com.example.oneToOne_unidirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oneToOne_unidirectional.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
