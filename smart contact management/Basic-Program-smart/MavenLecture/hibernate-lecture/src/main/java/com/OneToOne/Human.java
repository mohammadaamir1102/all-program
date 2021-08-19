package com.OneToOne;

import javax.persistence.*;

@Entity
@Table(name = "human_details")
public class Human {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "human_id")
	private int id;
	private String humanName;
	private String humanCity;

	@OneToOne(mappedBy = "human")
	private Aadhar aadhar;

	public Human() {
		super();
		
	}

	public Human(int id, String humanName, String humanCity, Aadhar aadhar) {
		super();
		this.id = id;
		this.humanName = humanName;
		this.humanCity = humanCity;
		this.aadhar = aadhar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHumanName() {
		return humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public String getHumanCity() {
		return humanCity;
	}

	public void setHumanCity(String humanCity) {
		this.humanCity = humanCity;
	}

	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", humanName=" + humanName + ", humanCity=" + humanCity + ", aadhar=" + aadhar + "]";
	}

}
