package aamir;

public class BooleanTest {
	
	
	public boolean sum(String y) {
		Boolean result = Boolean.FALSE;
		result = y.equalsIgnoreCase("Y");
		return result;
	}

	public static void main(String[] args) {
		
		BooleanTest booleanTest = new BooleanTest();
		System.out.println(booleanTest.sum("Y"));
		
	}
}
