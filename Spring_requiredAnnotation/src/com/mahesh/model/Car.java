package com.mahesh.model;

import org.springframework.beans.factory.annotation.Required;

public class Car {

	private String carname;
	private String carprice;
	private String carbrandname;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getCarname() {
		return carname;
	}

	@Required
	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getCarprice() {
		return carprice;
	}

	public void setCarprice(String carprice) {
		this.carprice = carprice;
	}

	public String getCarbrandname() {
		return carbrandname;
	}

	public void setCarbrandname(String carbrandname) {
		this.carbrandname = carbrandname;
	}

	@Override
	public String toString() {
		return "Car [carname=" + carname + ", carprice=" + carprice + ", carbrandname=" + carbrandname + "]";
	}

}
