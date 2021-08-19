package java8Revision;

/*Lambda Expression 
 * Provide the implementation of functional Interface
 * less coding
 * */

interface LambdaExpression {
	void run();
}

public class LambdaWithDefination {
	public static void main(String[] args) {
		LambdaExpression lambdaExpression = () -> System.out.println("Aamir khan");
		lambdaExpression.run();

	}

}
