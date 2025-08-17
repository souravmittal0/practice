package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
    public void method1() throws IOException {
    }

    public void method2() {
    }

    public Number method3() {
        return null;
    }

    public void method4() throws IOException {
    }
}

class Child extends Parent {

//    @Override
//    public void method1() throws Exception {
        //INVLAID: throwing BROADER exception
//    }

//    @Override
//    public void method1() {
//        //VALID
//    }

    @Override
    public void method1() throws FileNotFoundException {
        //VALID
    }

    @Override
    public void method2() /*throws IOException*/ {
        //cannot throw checked exception as parent is not throwing
    }

    @Override
    public Integer method3() {
        return null;
    }

    @Override
    public void method4() {
    }
}

public class OverridingWithException {
    public static void main(String[] args) {
        Parent parent = new Child();
        try {
            parent.method1();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            parent.method4();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Child child = new Child();
        try {
            child.method1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        child.method4();
    }
}
