package aamir;

public class StaticKeywordSession {

	int studentId;
	String studentName;
	static String collegeName = "SMBC";
	
	private StaticKeywordSession(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	void showStudentData() {
		System.out.println(studentId + " " + studentName + " " + collegeName);
	}

	public static void main(String[] args) {
		StaticKeywordSession staticKeywordSession1 = new StaticKeywordSession(33, "Aamir");
		StaticKeywordSession staticKeywordSession2 = new StaticKeywordSession(19, "Aasim");
		StaticKeywordSession staticKeywordSession3 = new StaticKeywordSession(13, "Aaquib");

		staticKeywordSession1.showStudentData();
		staticKeywordSession2.showStudentData();
		staticKeywordSession3.showStudentData();
	}
}
