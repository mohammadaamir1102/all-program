package com.practice;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable//enable for second level cache
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)//for reading and writing
public class Student {
	@Id
	private int Id;
	private String name;
	private String city;
	@OneToOne
	private Certificate certificate;
	public Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", city=" + city + ", certificate=" + certificate + "]";
	}
	
	

}
