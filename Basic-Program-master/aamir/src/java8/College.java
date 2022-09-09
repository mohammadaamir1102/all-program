package java8;

import java.time.LocalDate;

public class College {

	private int collegeID;
	private String collegeName;
	private String collegeAddress;
	private LocalDate collegeESTD;

	public College(int collegeID, String collegeName, String collegeAddress, LocalDate collegeESTD) {
		super();
		this.collegeID = collegeID;
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.collegeESTD = collegeESTD;
	}

	public int getCollegeID() {
		return collegeID;
	}

	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeAddress() {
		return collegeAddress;
	}

	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}

	public LocalDate getCollegeESTD() {
		return collegeESTD;
	}

	public void setCollegeESTD(LocalDate collegeESTD) {
		this.collegeESTD = collegeESTD;
	}

	@Override
	public String toString() {
		return "College [collegeID=" + collegeID + ", collegeName=" + collegeName + ", collegeAddress=" + collegeAddress
				+ ", collegeESTD=" + collegeESTD + "]";
	}

}
