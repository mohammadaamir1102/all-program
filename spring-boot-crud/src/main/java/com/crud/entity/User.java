package com.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;
    private String userName;
    private String userFatherName;
    private String userMobile;
    private String userAddress;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long userId, String userName, String userFatherName, String userMobile, String userAddress) {
		super();
		UserId = userId;
		this.userName = userName;
		this.userFatherName = userFatherName;
		this.userMobile = userMobile;
		this.userAddress = userAddress;
	}
	public Long getUserId() {
		return UserId;
	}
	public void setUserId(Long userId) {
		UserId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserFatherName() {
		return userFatherName;
	}
	public void setUserFatherName(String userFatherName) {
		this.userFatherName = userFatherName;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", userName=" + userName + ", userFatherName=" + userFatherName
				+ ", userMobile=" + userMobile + ", userAddress=" + userAddress + "]";
	}
    
    

}
