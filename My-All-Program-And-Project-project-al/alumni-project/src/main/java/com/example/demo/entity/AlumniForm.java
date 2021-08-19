package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AlumniForm implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String f_Name;
	private String l_Name;
	private String father_Name;
	private Long mo_no;	
	private Long aadhar_No;
	private String pan_no;
	private String dob;
	private String gender;
	private String address1;
	private String address2;
	private String pin;
	private String age;
	private String hobby;
	private String ClassX_Board;
	private String  ClassX_Percentage;
	private String ClassX_YrOfPassing;
	private String ClassXII_Board;
	private String ClassXII_Percentage;
	private String ClassXII_YrOfPassing;
	private String Graduation_Board;
	private String Graduation_Percentage;
	private String Graduation_YrOfPassing;
	private String Masters_Board;
	private String Masters_Percentage;
	private String  Masters_YrOfPassing;
	private String course;
	private String mode;
	private String t_fee;
	private String p_fee;	
	private String r_fee;
	private String ref_by;
	private String st_status;
	private String f_co_Name;
	private String s_co_Name;
	private String t_co_Name;
	private String fourth_co_Name;
	private String co_Technology;
	private String co_Address;
	private String role_Responsi;
	

	

}
