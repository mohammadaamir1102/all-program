package com.practice;

import javax.persistence.*;

@Entity
public class Certificate {
	@Id
	private int cid;
	private int duration;
	private String courseName;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Certificate [cid=" + cid + ", duration=" + duration + ", courseName=" + courseName + "]";
	}
	

}
