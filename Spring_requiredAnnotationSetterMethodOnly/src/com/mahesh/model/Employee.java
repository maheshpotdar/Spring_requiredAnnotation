package com.mahesh.model;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private String empName; // primitive variable.
	private Car car; // secondary variable.

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getEmpName() {
		return empName;
	}

	@Required
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", car=" + car + "]";
	}

	public Employee(String empName, Car car) {
		super();
		this.empName = empName;
		this.car = car;
	}

	public void displayInfo() {
		System.out.println("Employee Name: " + empName + " Car Info: " + car.getCarName() + " " + car.getAvg() + " "
				+ car.getCarprice() + " " + car.getModelyear());
	}

}
