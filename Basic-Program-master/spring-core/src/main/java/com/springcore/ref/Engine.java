package com.springcore.ref;

public class Engine {
	private String Ename;
	private Company com;
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public Company getCom() {
		return com;
	}
	public void setCom(Company com) {
		this.com = com;
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Engine [Ename=" + Ename + ", com=" + com + "]";
	}
	

}
