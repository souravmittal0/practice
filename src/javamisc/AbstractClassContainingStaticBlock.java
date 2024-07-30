package javamisc;

abstract class AbstractClassContainingStaticBlock {
	static {
		System.out.println("Parent Static Block.");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method.");
	}
}