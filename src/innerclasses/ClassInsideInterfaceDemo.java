package innerclasses;

interface Vehicle {
	public int get();
	class DefaultImplementation implements Vehicle {
		public int get() {
			return 2;
		}
	}
}
public class ClassInsideInterfaceDemo {
	public static void main(String[] args) {
		Vehicle.DefaultImplementation d = new Vehicle.DefaultImplementation();
		System.out.println(d.get());
	}
}