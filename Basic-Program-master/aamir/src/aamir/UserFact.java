package aamir;
import java.util.Scanner;
public class UserFact {
	public static void main(String[] args) {
		int n; int fact=1;
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
	System.out.println("Enter The Number");
	n=s.nextInt();
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
System.out.println(fact);
	}

}
