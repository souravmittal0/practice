package innerclasses;

class InnerClassDemo5 {

	int x = 10;

	class Inner {

		int x = 100;

		public void m1() {
			int x = 1000;
			System.out.println("Inner Class Instance Method");
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(InnerClassDemo5.this.x);
		}
	}
		
	public static void main(String[] args) {
		System.out.println("Outer Class Main Method");
		new InnerClassDemo5().new Inner().m1();
	}
}