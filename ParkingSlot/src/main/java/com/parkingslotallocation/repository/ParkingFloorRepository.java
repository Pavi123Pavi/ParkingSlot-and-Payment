package com.parkingslotallocation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parkingslotallocation.model.ParkingFloor;

@Repository
public interface ParkingFloorRepository extends JpaRepository<ParkingFloor, Integer> {

	ParkingFloor findByParkingFloorId(int parkingFloorId);
	ParkingFloor findByFloorNumber(String floorNumber);
	

}
