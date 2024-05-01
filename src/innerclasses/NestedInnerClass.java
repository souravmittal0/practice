package innerclasses;

class Outer1 {
	class Inner1 {
		class Inner2 {
			public void m1() {
				System.out.println("Inner Most Class Instance Method");
			}
		}
	}
}
public class NestedInnerClass {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Outer1.Inner1 i1 = o.new Inner1();
		Outer1.Inner1.Inner2 i2 = i1.new Inner2();
		i2.m1();
	}
}