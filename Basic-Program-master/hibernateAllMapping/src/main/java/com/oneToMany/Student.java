package com.oneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private String addressString;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List< Certificate> certificate;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressString() {
		return addressString;
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	
	public List<Certificate> getCertificate() {
		return certificate;
	}
	public void setCertificate(List<Certificate> certificate) {
		this.certificate = certificate;
	}
	/*
	 * @Override public String toString() { return "Student [rollno=" + rollno +
	 * ", name=" + name + ", addressString=" + addressString + ", certificate=" +
	 * certificate + "]"; }
	 */
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", addressString=" + addressString + ", certificate="
				+ certificate + "]";
	}

}
