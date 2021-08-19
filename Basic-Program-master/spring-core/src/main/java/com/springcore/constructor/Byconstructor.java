package com.springcore.constructor;

import java.util.List;

public class Byconstructor {
	private int id;
	private String name;
	private String address;
	private Contact contac;
	private List<String> list;
	 Byconstructor(int id, String name, String address, Contact contac,List<String>list) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contac = contac;
		this.list=list;
	}
	@Override
	public String toString() {
		return "Byconstructor [id=" + id + ", name=" + name + ", address=" + address + ", contac=" + contac + ", list="
				+ list + "]";
	}

	
	
	

}
