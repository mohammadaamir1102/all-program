package com.springcore.auto.wire;

public class Employee {
	//here Address is an object so we can use auto-wiring
	// auto wiring can't be use for primitive and String
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	

}
