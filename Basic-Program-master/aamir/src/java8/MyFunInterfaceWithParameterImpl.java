package java8;

public class MyFunInterfaceWithParameterImpl {

	public static void main(String[] args) {
		MyFunInterfaceWithParameter myFunInterfaceWithParameter = (name)->{
			return "Hello "+name;
		};
		System.out.println(myFunInterfaceWithParameter.name("Aamir khan"));
	}
}
