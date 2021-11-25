package com.parkingslotallocation.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Vehicle_Id")
	private int vehicleId;
    @Column(name ="Vehicle_Type")
	@Enumerated(EnumType.ORDINAL)
	private VehicleType vehicleType;
	@Column(name = "vehicle_Number")
	private String vehicleNumber;
	@Column(name = "Vehicle_Company")
	private String vehicleCompany;
	@Column(name ="Vehicle_Model")
	private String vehicleModel;
	@Column(name ="Owner")
	@OneToOne
	private User owner;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleCompany() {
		return vehicleCompany;
	}
	public void setVehicleCompany(String vehicleCompany) {
		this.vehicleCompany = vehicleCompany;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	Vehicle(int vehicleId, VehicleType vehicleType, String vehicleNumber, String vehicleCompany, String vehicleModel,
			User owner) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
		this.vehicleCompany = vehicleCompany;
		this.vehicleModel = vehicleModel;
		this.owner = owner;
	}
	Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
