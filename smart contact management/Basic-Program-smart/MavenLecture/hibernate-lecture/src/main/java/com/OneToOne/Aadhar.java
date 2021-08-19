package com.OneToOne;

import javax.persistence.*;

@Entity
@Table(name = "human_aadharDetails")
public class Aadhar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "aadhar_id")
	private int id;

	private String aadharNumber;

	@OneToOne
	private Human human;

	public Aadhar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aadhar(int id, String aadharNumber, Human human) {
		super();
		this.id = id;
		this.aadharNumber = aadharNumber;
		this.human = human;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}

	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", aadharNumber=" + aadharNumber + ", human=" + human + "]";
	}

}
