package com.smart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long contactId;

	private String contactName;

	private String contactSecondName;

	private String contactWork;

	private String contactEmail;

	private String contactPhone;

	@Column(length = 100000)
	private String contactDes;

	@ManyToOne
	private User user;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Long contactId, String contactName, String contactSecondName, String contactWork,
			String contactEmail, String contactPhone, String contactDes, User user) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactSecondName = contactSecondName;
		this.contactWork = contactWork;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;

		this.contactDes = contactDes;
		this.user = user;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactSecondName() {
		return contactSecondName;
	}

	public void setContactSecondName(String contactSecondName) {
		this.contactSecondName = contactSecondName;
	}

	public String getContactWork() {
		return contactWork;
	}

	public void setContactWork(String contactWork) {
		this.contactWork = contactWork;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getcontactDes() {
		return contactDes;
	}

	public void setcontactDes(String contactDes) {
		this.contactDes = contactDes;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
