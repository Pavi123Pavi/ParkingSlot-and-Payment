package com.parkingslotallocation.ParkingSlot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.parkingslotallocation.exception.ParkingSlotNotAvailableException;
import com.parkingslotallocation.model.ParkingFloor;
import com.parkingslotallocation.model.ParkingPremise;
import com.parkingslotallocation.model.ParkingSlots;
import com.parkingslotallocation.repository.AddressRepository;
import com.parkingslotallocation.repository.ParkingFloorRepository;
import com.parkingslotallocation.repository.ParkingPremiseRepository;
import com.parkingslotallocation.repository.ParkingSlotsRepository;
import com.parkingslotallocation.service.ParkingServiceImpl;


@SpringBootTest
public class ParkingServiceImplTest {


	@Autowired
	ParkingPremiseRepository parkPremiseRepo;
	@Autowired
	ParkingFloorRepository parkFloorRepo;
	@Autowired
	ParkingSlotsRepository parkSlotsRepo;
	@Autowired
	AddressRepository addressRepo; 
	ParkingSlots slots;
	
	@Autowired
	ParkingServiceImpl psi;
	
	
	@Test
	public void slotBookTest() throws ParkingSlotNotAvailableException{
		Date date = new Date();
		boolean value = psi.checkAvailability(date, "01:00");
		assertEquals( true , value);
	}
	
	@Test
	public void getAllSlotsByPremiseTest(){
		ParkingPremise p = new ParkingPremise();
		int i = psi.getAllParkingSlotsByPremise(p).size();
		int j = parkPremiseRepo.findAll().size();
		assertEquals(i, j);
	}
	
	public void getAllSlotsByFloorTest() {
		ParkingFloor pf = new ParkingFloor();
		int k = psi.getAllParkingSlotsByFloor(pf).size();
		int l = parkFloorRepo.findAll().size();
	}
	
	@Test
	public void getParkingSlotsByIdTest() {
	ParkingSlots ps  =	parkSlotsRepo.findByParkingSlotId(10);	
	assertEquals(ps.getParkingSlotId(),10);
	}
	
	@Test
	public void bookSlotTest() {
		ParkingSlots p = new ParkingSlots();
		p.setParkingSlotId(15);
		parkSlotsRepo.save(p);
		assertEquals(p.getParkingSlotId(),15);
	}
	

}


