package com.example.oneToOne_unidirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oneToOne_unidirectional.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
