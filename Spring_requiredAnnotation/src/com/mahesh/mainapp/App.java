package com.mahesh.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.model.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/resources/spring.xml");

		context.getBean("c1");
		// car madhe setter injection zale.
		// jar setter injection kela asel tar.

		Employee employee = (Employee) context.getBean("e1");
		// employee madhe setter injection zale.
		// jar setter injection kela asel tar.
		employee.displayInfo();
	}
}
