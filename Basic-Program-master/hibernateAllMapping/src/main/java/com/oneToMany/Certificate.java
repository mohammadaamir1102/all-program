package com.oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certificate {
	@Id
	private int certificateId;
	private int duration;
	private String certificate;
	
	public int getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "Certificate [certificateId=" + certificateId + ", duration=" + duration + ", certificate=" + certificate
				+ "]";
	}

}
