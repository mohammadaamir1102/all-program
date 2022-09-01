package java8;

public interface MyFunInterface {

	void show();

	static int age(int i) {
		return i;
	}

	default String name(String name) {
		return "Hello " + name;
	}

}
