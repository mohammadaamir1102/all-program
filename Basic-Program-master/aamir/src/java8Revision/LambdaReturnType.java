package java8Revision;

interface LambadaReturn {
	int show(int a, int b);
}

public class LambdaReturnType {
	public static void main(String[] args) {
		LambadaReturn lambadaReturn = (a, b) -> {
			if(b<=a) {
				throw new RuntimeException("b should be greater than a");
			}else {
				return b-a;
			}
		};
		System.out.println("sum of a and b: "+lambadaReturn.show(10, 3));

	}

}
