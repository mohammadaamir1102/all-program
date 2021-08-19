package aamir;

public class MethodChanning {
	int id;
	String name;
	 public MethodChanning set(int id) {
		this.id=id;
		return this;
	}
	public MethodChanning get(String name) {
		this.name=name;
		return this;
	}
	void show()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		System.out.println("Id"+"\tName");
		MethodChanning m=new MethodChanning();
		m.set(12).get("\taamir").show();

	}

}
