package aamir;

class Method {
	int empid;
	String name;

	void display(int id, String n) {
		empid = id;
		name = n;
		System.out.println(empid + "" + name);
	}

	public static void main(String arg[]) {
		Method t1 = new Method();
		System.out.println("ID" + "\tNAME");
		t1.display(101, "\tArshad");
		t1.display(102, "\tAamir");
		t1.display(102, "\tAtif");
	}

}
