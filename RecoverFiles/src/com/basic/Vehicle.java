package com.basic;

public class Vehicle {
	private int vId;
	private String vName;
	private Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Vehicle(int vId, String vName) {
		super();
		this.vId = vId;
		this.vName = vName;
	}
	public int getVehicleId() {
		return vId;
	}
	public void setVehicleId(int vId) {
		this.vId = vId;
	}
	public String getVehicleName() {
		return vName;
	}
	public void setVehicleName(String vName) {
		this.vName = vName;
	}
	
	
}
