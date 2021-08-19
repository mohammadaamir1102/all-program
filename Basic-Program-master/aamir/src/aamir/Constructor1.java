package aamir;

public class Constructor1 {
	public Constructor1() {
		System.out.println("aamir khan");
	}
	Constructor1(int a){
		this();
		System.out.println(a);
	}

	public static void main(String[] args) {
		Constructor1 c=new Constructor1(3);

	}

}
