package lambda;

interface Test {
	public void m1();
}

/*
We can
 */
public class AccessingVariablesFromLambdaExpression {
	int x = 10;	//instance variable
	public void m2() {
		int y = 20;	//local variable
		Test t = () -> {
			System.out.println(x);	//10
			System.out.println(y);	//20
			x = 30;
			System.out.println(x);	//30
			//y = 40;	//CE: java: local variables referenced from a lambda expression must be final or effectively final
			System.out.println(y);	//20

		};
		//y = 40;
		t.m1();
	}

	public static void main(String[] args) {
		AccessingVariablesFromLambdaExpression t = new AccessingVariablesFromLambdaExpression();
		t.m2();
	}
}
