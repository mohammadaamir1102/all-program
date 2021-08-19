package aamir;

public class Aggregation2 {
	int id;
	String name;
	Aggregation1 aggregation1;
	public Aggregation2(int id, String name, Aggregation1 aggregation1) {
		super();
		this.id = id;
		this.name = name;
		this.aggregation1 = aggregation1;
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(aggregation1.city+" "+aggregation1.pinCode+" "+aggregation1.street);
	}
	public static void main(String[] args) {
		Aggregation1 aggregation1=new Aggregation1("Basti", "272001", "millat nagar");
		Aggregation2 aggregation2=new Aggregation2(1, "Aamir khan", aggregation1);
		aggregation2.display();
	}

}
