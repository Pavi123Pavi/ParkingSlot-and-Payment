package com.parkingslotallocation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table
public class ParkingFloor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ParkingFloor_Id")
	private int parkingFloorId;
	@Column(name = "Parking_Premise")
	//@OneToOne(cascade = CascadeType.ALL)
	@ManyToOne
	private ParkingPremise parkingPremise;
	@Column(name = "Floor_Number")
	private String floorNumber;
	@Column(name = "Number_Of_Parking_Slots")
	private int numberOfParkingSlots;
	
	
	
	public int getParkingFloorId() {
		return parkingFloorId;
	}
	public void setParkingFloorId(int parkingFloorId) {
		this.parkingFloorId = parkingFloorId;
	}
	public ParkingPremise getParkingPremise() {
		return parkingPremise;
	}
	public void setParkingPremise(ParkingPremise parkingPremise) {
		this.parkingPremise = parkingPremise;
	}
	public String getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}
	public int getNumberOfParkingSlots() {
		return numberOfParkingSlots;
	}
	public void setNumberOfParkingSlots(int numberOfParkingSlots) {
		this.numberOfParkingSlots = numberOfParkingSlots;
	}
	public ParkingFloor() {
		super();
		// TODO Auto-generated constructor stub
	}
	ParkingFloor(int parkingFloorId, ParkingPremise parkingPremise, String floorNumber, int numberOfParkingSlots) {
		super();
		this.parkingFloorId = parkingFloorId;
		this.parkingPremise = parkingPremise;
		this.floorNumber = floorNumber;
		this.numberOfParkingSlots = numberOfParkingSlots;
	}
	
}
