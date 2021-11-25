package com.parkingslotallocation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parkingslotallocation.model.Address;

@Repository
public interface AddressRepository extends JpaRepository <Address, Integer>{

}
