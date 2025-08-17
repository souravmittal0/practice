package misc;

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
}

public class OverridingWithException {
}
