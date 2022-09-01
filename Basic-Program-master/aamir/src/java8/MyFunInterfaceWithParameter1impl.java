package java8;

public class MyFunInterfaceWithParameter1impl {

	public static void main(String[] args) {
		MyFunInterfaceWithParameter1 myFunInterfaceWithParameter1 = (a, b) -> {
			if (a < b) {
				throw new RuntimeException("A value should be greater than B");
			} else {
				return a;
			}
		};
		System.out.println(myFunInterfaceWithParameter1.result(10, 20));
	}
}
