package innerclasses;

//Accessing Inner class code from static area of Outer class
public class InnerClassDemo {
    class Inner {
        public void m1() {
            System.out.println("Inner");
        }
    }

    public static void main(String[] args) {
        InnerClassDemo innerClassDemo = new InnerClassDemo();   //Outer class
        InnerClassDemo.Inner inner1 = innerClassDemo.new Inner();
        inner1.m1();

        //Combining two lines
        InnerClassDemo.Inner inner2 = new InnerClassDemo().new Inner();
        inner2.m1();
    }
}
