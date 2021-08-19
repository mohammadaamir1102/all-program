package aamir; 
class Book{
	float salary=10000.00f;
}

public class Bonus extends Book {
	int bonus=20000;
	public static void main(String[] args) {
		
		Bonus b=new Bonus();
		System.out.println("Salary is "+b.bonus);
		System.out.println("Salary is "+b.salary);
	}

}
