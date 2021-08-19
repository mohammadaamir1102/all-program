package com.springcore.ref;

public class Company {
	private String Cname;

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Company [Cname=" + Cname + "]";
	}
	
}
