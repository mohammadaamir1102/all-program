package java8;

public class MyFunInterfaceImpl {

	// () -> {body}
	public static void main(String[] args) {
		MyFunInterface myFunInterface = () -> {
			System.out.println("Showing method called !");
		};
		myFunInterface.show();
		System.out.println(myFunInterface.name("Aamir"));
		System.out.println(MyFunInterface.age(15));
		
		
		if(!false==true) {
			System.out.println("hello");
		}
	}

	/*
	 * @Override public void show() { System.out.println("Aamir khan"); // this is
	 * traditional way }
	 */

	/*
	 * note if we are using implement then need to override then with implement we
	 * can use Lambda expression
	 */
	
	/* note :- if there is no parameter in the method then do not need to curly braces*/
}
