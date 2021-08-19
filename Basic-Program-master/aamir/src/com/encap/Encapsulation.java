package com.encap;

class AamirKhan1 {
	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;	
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		AamirKhan1 aamirKhan1=new AamirKhan1();
		aamirKhan1.setName("Aamir khan");
		aamirKhan1.setAddress("Gumnam gali");
		System.out.println(aamirKhan1.getName());
		System.out.println(aamirKhan1.getAddress());
		
	}
	
	

}
