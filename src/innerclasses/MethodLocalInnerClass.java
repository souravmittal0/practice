package innerclasses;

class MethodLocalInnerClass {
	public void m1() {
		class Inner {
			public void sum(int x, int y) {
				System.out.println("Sum: " + (x + y));
			}
		}
		Inner i = new Inner();
		i.sum(10, 20);
		i.sum(100, 200);
	}
	public static void main(String[] args) {
		MethodLocalInnerClass o = new MethodLocalInnerClass();
		o.m1();
	}
}