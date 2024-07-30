package javamisc;

class ParentForBlockExamples {
	static {
		System.out.println("Parent Static Block.");
	}
	
	{
		System.out.println("Parent Instance Block.");
	}
	
	ParentForBlockExamples() {
		System.out.println("Parent Constructor.");
	}
}

class ChildForBlockExamples extends ParentForBlockExamples {
	static {
		System.out.println("Child Static Block.");
	}
	
	{
		System.out.println("Child Instance Block.");
	}
	
	ChildForBlockExamples() {
		System.out.println("Child Constructor.");
	}
}

public class ParentChildStaticInstanceBlockExamples {
	public static void main(String[] args) {
		System.out.println("=== Creating Parent Object ===");
		ParentForBlockExamples obj1 = new ParentForBlockExamples();
		
		System.out.println("=== Creating Child Object ===");
		ChildForBlockExamples obj2 = new ChildForBlockExamples();
		
		System.out.println("=== Creating Runtimne Polymorphism ===");
		ParentForBlockExamples obj3 = new ChildForBlockExamples();
	}
}
