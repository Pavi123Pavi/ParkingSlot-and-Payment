package com.parkingslotallocation.service;

import java.util.Date;
import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.parkingslotallocation.exception.NoSuchParkingSlotException;
import com.parkingslotallocation.exception.ParkingSlotNotAvailableException;
import com.parkingslotallocation.model.ParkingFloor;
import com.parkingslotallocation.model.ParkingPremise;
import com.parkingslotallocation.model.ParkingSlots;

@Service

public interface ParkingService {
	
	public boolean checkAvailability(Date date, String time) throws ParkingSlotNotAvailableException;
	public boolean bookParkingSlot(ParkingSlots slot) throws ParkingSlotNotAvailableException;
	public boolean cancelParkingSlotBooking(long parkingSlotId) throws NoSuchParkingSlotException;
	
	public List<ParkingSlots> getAllParkingSlotsByPremise(ParkingPremise parkingPremise);
	public List<ParkingSlots> getAllParkingSlotsByFloor(ParkingFloor parkingFloor);
	public Optional<ParkingSlots> getParkingSlotsById(long parkingSlotId)throws NoSuchParkingSlotException;

}
