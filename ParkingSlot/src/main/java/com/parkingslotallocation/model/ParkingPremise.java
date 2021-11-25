package com.parkingslotallocation.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ParkingPremise")
public class ParkingPremise {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Parking_Premise_Id")
	private int parkingPremiseId;
	@Column(name = "Parking_Premise_Name")
	private String parkingPremiseName;
	@OneToOne(cascade = CascadeType.ALL)
	@Column(name = "Parking_Premise_Address")
	private Address premiseAddress;
	@Column(name = "Number_Of_Parking_Floors")
	private int numberOfParkingFloors;
	public int getParkingPremiseId() {
		return parkingPremiseId;
	}
	public void setParkingPremiseId(int parkingPremiseId) {
		this.parkingPremiseId = parkingPremiseId;
	}
	public String getParkingPremiseName() {
		return parkingPremiseName;
	}
	public void setParkingPremiseName(String parkingPremiseName) {
		this.parkingPremiseName = parkingPremiseName;
	}
	public Address getPremiseAddress() {
		return premiseAddress;
	}
	public void setPremiseAddress(Address premiseAddress) {
		this.premiseAddress = premiseAddress;
	}
	public int getNumberOfParkingFloors() {
		return numberOfParkingFloors;
	}
	public void setNumberOfParkingFloors(int numberOfParkingFloors) {
		this.numberOfParkingFloors = numberOfParkingFloors;
	}
	ParkingPremise(int parkingPremiseId, String parkingPremiseName, Address premiseAddress, int numberOfParkingFloors) {
		super();
		this.parkingPremiseId = parkingPremiseId;
		this.parkingPremiseName = parkingPremiseName;
		this.premiseAddress = premiseAddress;
		this.numberOfParkingFloors = numberOfParkingFloors;
	}
	public ParkingPremise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
