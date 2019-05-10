package com.mahesh.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.model.Employee;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee person=(Employee)context.getBean("t1");
		context.getBean("c1");
		
		person.displayInfo();
		
	}	
}
