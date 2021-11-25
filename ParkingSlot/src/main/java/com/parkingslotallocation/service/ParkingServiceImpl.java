package com.parkingslotallocation.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.parkingslotallocation.exception.NoSuchParkingSlotException;
import com.parkingslotallocation.exception.ParkingSlotNotAvailableException;
import com.parkingslotallocation.model.ParkingFloor;
import com.parkingslotallocation.model.ParkingPremise;
import com.parkingslotallocation.model.ParkingSlots;
import com.parkingslotallocation.repository.AddressRepository;
import com.parkingslotallocation.repository.ParkingFloorRepository;
import com.parkingslotallocation.repository.ParkingPremiseRepository;
import com.parkingslotallocation.repository.ParkingSlotsRepository;


@Service
public class ParkingServiceImpl implements ParkingService {

	@Autowired
	ParkingPremiseRepository parkPremiseRepo;
	@Autowired
	ParkingFloorRepository parkFloorRepo;
	@Autowired
	ParkingSlotsRepository parkSlotsRepo;
	@Autowired
	AddressRepository addressRepo;
	ParkingSlots slots;

//Check Slot availability 
	
	@Override
	@Transactional
	public boolean checkAvailability(Date date, String time) throws ParkingSlotNotAvailableException {
		ParkingSlots p = parkSlotsRepo.findByParkingDateAndParkingTime(date, time);
		if (p != null)
			return false;
		return true;
	}

//Book Slot
	
	@Override
	@Transactional
	public boolean bookParkingSlot(ParkingSlots slot) throws ParkingSlotNotAvailableException {
		Optional<ParkingSlots> p = parkSlotsRepo.findById(slot.getParkingSlotId());
		if (p.isPresent())
			throw new ParkingSlotNotAvailableException("Parking slot is occupied");
		parkSlotsRepo.save(slot);
		return true;
	}

	
//Cancel Slot
	
	@Override
	@Transactional
	public boolean cancelParkingSlotBooking(long parkingSlotId) throws NoSuchParkingSlotException{
		Optional<ParkingSlots> p = parkSlotsRepo.findById(parkingSlotId);
		if(!p.isPresent())
			throw new NoSuchParkingSlotException("No Parking Slot found for this ID");
		parkSlotsRepo.deleteById(parkingSlotId);
		return true;
	}

//Display all Slot by Premise
	
	@Override
	@Transactional
	public List<ParkingSlots> getAllParkingSlotsByPremise(ParkingPremise parkingPremise) {
		return parkSlotsRepo.findAll();
	}
	
//Display all Slot by Premise
	
	@Override
	@Transactional
	public List<ParkingSlots> getAllParkingSlotsByFloor(ParkingFloor parkingFloor) {
		return parkSlotsRepo.findAll();
	}


//Display Slot by ID
	
	@Override
	@Transactional
	public Optional<ParkingSlots> getParkingSlotsById(long parkingSlotId) throws NoSuchParkingSlotException {

		Optional<ParkingSlots> slot = parkSlotsRepo.findById(parkingSlotId);
		if (!slot.isPresent())
			throw new NoSuchParkingSlotException("Slot With Id " + parkingSlotId + " Not Found");
		return slot;
	}

}

