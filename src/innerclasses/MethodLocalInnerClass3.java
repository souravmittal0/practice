package innerclasses;

class MethodLocalInnerClass3 {
	int x = 10;
	static int y = 20;
	
	public static void m1() {
		class Inner {
			public void m2() {
				//System.out.println(x);
				System.out.println(y);
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args) {
		MethodLocalInnerClass3 o = new MethodLocalInnerClass3();
		o.m1();
	}
}