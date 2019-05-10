package com.mahesh.model;

import org.springframework.beans.factory.annotation.Required;

public class Car {

	private String modelyear;
	private String carName;
	private float avg;
	private int carprice;

	public Car() {
		System.out.println("Called Welcome");
	}

	public String getCarName() {
		return carName;
	}
	@Required
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public float getAvg() {
		return avg;
	}
	@Required
	public void setAvg(float avg) {
		this.avg = avg;
	}

	public int getCarprice() {
		return carprice;
	}
	@Required
	public void setCarprice(int carprice) {
		this.carprice = carprice;
	}

	public Car(String modelyear) {
		super();
		this.modelyear = modelyear;
	}

	public String getModelyear() {
		return modelyear;
	}
	@Required
	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}

	@Override
	public String toString() {
		return "Car [modelyear=" + modelyear + ", carName=" + carName + ", avg=" + avg + ", carprice=" + carprice + "]";
	}

}
