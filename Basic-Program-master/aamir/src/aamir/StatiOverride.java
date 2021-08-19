package aamir;
class Saif{
	static void show() {
		System.out.println("saif");
	}
		static void show(int a) { 
			System.out.println("zaid");
		}
	}
public class StatiOverride {

	public static void main(String[] args) {
		Saif s=new Saif();
		s.show(10);
		

	}

}
