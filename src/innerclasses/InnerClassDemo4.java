package innerclasses;

class InnerClassDemo4 {
	
	int x = 10;
	static int y = 20;
	
	class Inner {
		public void m1() {
			System.out.println("Inner Class Instance Method");
			System.out.println(x);
			System.out.println(y);
		}
	}
		
	public static void main(String[] args) {
		System.out.println("Outer Class Main Method");
		new InnerClassDemo4().new Inner().m1();
	}
}