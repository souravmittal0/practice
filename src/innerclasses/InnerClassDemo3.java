package innerclasses;

class Outer {
	class Inner {
		public void m1() {
			System.out.println("Inner Class Instance Method");
		}
	}
}

public class InnerClassDemo3 {
	public static void main(String[] args) {
		System.out.println("Outer Class Main Method");
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
	}
}