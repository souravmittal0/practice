package innerclasses;

//Accessing Inner class code from instance area of Outer class
public class InnerClassDemo2 {
    class Inner {
        public void m1() {
            System.out.println("Inner Class Instance Method");
        }
    }

    public void m2() {
        Inner i = new Inner();
        i.m1();
    }

    public static void main(String[] args) {
        System.out.println("Outer Class Main Method");
        InnerClassDemo2 o = new InnerClassDemo2();
        o.m2();
    }
}
