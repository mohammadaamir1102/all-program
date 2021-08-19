package com.springcore.lifecycle;

//configure technique by xml
public class Technology {
	private double priceOfcpu;
	
	

	public double getPriceOfcpu() {
		return priceOfcpu;
	}

	public void setPriceOfcpu(double priceOfcpu) {
		System.out.println("first setting");
		this.priceOfcpu = priceOfcpu;
	}

	public Technology() {
		super();
	System.out.println("constructor");
	}

	@Override
	public String toString() {
		return "Technology [priceOfcpu=" + priceOfcpu + "]";
	}

	// here init method for seeing to calling and int method call after setting the
	// value
	// we can change the name of init and destroy method then we have to also change
	// name into xml file
	public void init() {
		System.out.println("init method");
	}

	// here destroy method for seeing to calling and destroy method call in end
	// moment when we call
	// registerShutdownHook() method then call destroy method
	public void destroy() {
		System.out.println("destroy method");
	}
}
