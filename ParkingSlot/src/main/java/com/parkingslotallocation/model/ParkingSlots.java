package com.parkingslotallocation.model;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ParkingSlots")
public class ParkingSlots {
	
		@Id
		@Column(name = "Parking_Slot_Id")
		private long parkingSlotId;
		@ManyToOne()
		//@JoinColumn(name = "Floor_Slots")
		@Column(name = "Parking_Floor")
		private ParkingFloor parkingFloor;
		@OneToOne(cascade = CascadeType.ALL)
		@Column(name = "Vehicle")
		private Vehicle vehicle;
		@Column(name = "Parking_Date")
		private Date parkingDate;
		@Column(name = "Parking_Time")
		private String parkingTime;
		@Column(name = "Booking_Date")
		private Date bookingDate;
		@Column(name = "Parking_Duration")
		private int parkingDuration;
		//@OneToMany(cascade = CascadeType.ALL , mappedBy = "parkingSlots")
		//@Column(name = "Payment")
		@ManyToOne()
		private Payment payment;
		public long getParkingSlotId() {
			return parkingSlotId;
		}
		public void setParkingSlotId(long parkingSlotId) {
			this.parkingSlotId = parkingSlotId;
		}
		public ParkingFloor getParkingFloor() {
			return parkingFloor;
		}
		public void setParkingFloor(ParkingFloor parkingFloor) {
			this.parkingFloor = parkingFloor;
		}
		public Vehicle getVehicle() {
			return vehicle;
		}
		public void setVehicle(Vehicle vehicle) {
			this.vehicle = vehicle;
		}
		public Date getParkingDate() {
			return parkingDate;
		}
		public void setParkingDate(Date parkingDate) {
			this.parkingDate = parkingDate;
		}
		public String getParkingTime() {
			return parkingTime;
		}
		public void setParkingTime(String parkingTime) {
			this.parkingTime = parkingTime;
		}
		public Date getBookingDate() {
			return bookingDate;
		}
		public void setBookingDate(Date bookingDate) {
			this.bookingDate = bookingDate;
		}
		public int getParkingDuration() {
			return parkingDuration;
		}
		public void setParkingDuration(int parkingDuration) {
			this.parkingDuration = parkingDuration;
		}
		public Payment getPayment() {
			return payment;
		}
		public void setPayment(Payment payment) {
			this.payment = payment;
		}
		ParkingSlots(long parkingSlotId, ParkingFloor parkingFloor, Vehicle vehicle, Date parkingDate,
				String parkingTime, Date bookingDate, int parkingDuration, Payment payment) {
			super();
			this.parkingSlotId = parkingSlotId;
			this.parkingFloor = parkingFloor;
			this.vehicle = vehicle;
			this.parkingDate = parkingDate;
			this.parkingTime = parkingTime;
			this.bookingDate = bookingDate;
			this.parkingDuration = parkingDuration;
			this.payment = payment;
		}
		public ParkingSlots() {
			super();
			// TODO Auto-generated constructor stub
		}
		

}
