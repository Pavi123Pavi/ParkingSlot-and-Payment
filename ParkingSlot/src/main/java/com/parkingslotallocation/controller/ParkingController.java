package com.parkingslotallocation.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.parkingslotallocation.exception.DuplicateUserException;
import com.parkingslotallocation.exception.NoSuchParkingSlotException;
//import com.parkingslotallocation.exception.NoSuchUserException;
import com.parkingslotallocation.exception.ParkingSlotNotAvailableException;
import com.parkingslotallocation.model.ParkingFloor;
import com.parkingslotallocation.model.ParkingPremise;
import com.parkingslotallocation.model.ParkingSlots;
//import com.parkingslotallocation.model.User;
import com.parkingslotallocation.service.ParkingService;

@RestController
@RequestMapping(value = "ParkingSlot/Parking")
public class ParkingController {
	
		@Autowired
		ParkingService service;
		ParkingFloor fs;
		ParkingSlots ps;

	

		@GetMapping("checkavail/{date}/{time}")
		public ResponseEntity<?> checkAvailability(@PathVariable("date") String date, @PathVariable("time") String time)
				throws ParkingSlotNotAvailableException, ParseException {
			
			String pattern = "yyyy-MM-dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			Date date1 = simpleDateFormat.parse(date);
			
			if (!service.checkAvailability(date1, time)) {
				throw new ParkingSlotNotAvailableException("Slot unavailable");
			}
			service.checkAvailability(date1, time);
			return new ResponseEntity<String>("Slot available", HttpStatus.OK);
		}

	//Book parking
		
		@PostMapping("/register")
		public ResponseEntity<?> bookPark(@RequestBody ParkingSlots slot ) throws NoSuchParkingSlotException, ParkingSlotNotAvailableException {
			Optional<ParkingSlots> opt = service.getParkingSlotsById(slot.getParkingSlotId());
			if (!opt.isPresent())
				throw new NoSuchParkingSlotException("User with Id " + slot.getParkingSlotId() + "Already exists");
			service.bookParkingSlot(slot);
			return new ResponseEntity<String>("Parking slot booked", HttpStatus.CREATED);
		}

	//Cancel Slot

		@DeleteMapping("/delete/{slotId}")
		public ResponseEntity<?> deleteSlot(@PathVariable("slotId") long parkingSlotId ) throws NoSuchParkingSlotException{
			Optional<ParkingSlots> ps = service.getParkingSlotsById(parkingSlotId);
			if (!ps.isPresent()) {
				throw new NoSuchParkingSlotException("Parking does not exist");
			}
			service.cancelParkingSlotBooking(parkingSlotId);
			return new ResponseEntity<String>("User deleted Succesfully", HttpStatus.ACCEPTED);
		}

	//Display all Slot by Premise

		@GetMapping("allpp")
		public ResponseEntity<List<ParkingSlots>> getAllParkingSlotsByPremise(
				@RequestBody ParkingPremise parkingPremise) {
			List<ParkingSlots> p = service.getAllParkingSlotsByPremise(parkingPremise);
			return new ResponseEntity<List<ParkingSlots>>(p, HttpStatus.OK);
		}

	//Display Slot by ID

		@GetMapping("{slotId}")
		
		public ResponseEntity<Optional<ParkingSlots>> getParkingSlotsById(@PathVariable("slotId") long parkingSlotId) throws NoSuchParkingSlotException {
			Optional<ParkingSlots> ps = service.getParkingSlotsById(parkingSlotId);
			return new ResponseEntity<Optional<ParkingSlots>>(ps, HttpStatus.OK);
		}
}