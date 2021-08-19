package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	/*
	 * here Address is an object so we can use auto-wiring here auto wiring can't be
	 * use for primitive and String
	 */
	/* we can use @Autowired on constructor and variable and setter */
	/*
	 * @Qualifier is use for remove the confusion here address1 is the name of bean
	 * class which is taken from xml file
	 */
	@Autowired
	@Qualifier( "address1")
	private Address address;


	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
