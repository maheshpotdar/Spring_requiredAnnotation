package com.mahesh.model;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private String empname;
	private String empaddress;
	private String empcountry;
	private String state;
	private String city;

	private Car car;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getEmpname() {
		return empname;
	}

	@Required
	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	@Required
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public String getEmpcountry() {
		return empcountry;
	}

	@Required
	public void setEmpcountry(String empcountry) {
		this.empcountry = empcountry;
	}

	public String getState() {
		return state;
	}

	@Required
	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	@Required
	public void setCity(String city) {
		this.city = city;
	}

	public Car getCar() {
		return car;
	}

	@Required
	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empaddress=" + empaddress + ", empcountry=" + empcountry + ", state="
				+ state + ", city=" + city + ", car=" + car + "]";
	}

	public void displayInfo() {

		System.out.println("Employee Information\n");

		System.out.println("EmpName: " + empname);
		System.out.println("EmpAddress: " + empaddress);
		System.out.println("EmpCountry: " + empcountry);

		System.out.println("Car Information\n");
		System.out.println("Car Name: " + car.getCarname());
		System.out.println("Car BrandName: " + car.getCarbrandname());
		System.out.println("Car Price: " + car.getCarprice());
	}

}
