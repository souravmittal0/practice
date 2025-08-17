package misc;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {
    public void method1() throws IOException {
    }

    public Number method2() {
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
    public Integer method2() {
        return null;
    }
}

public class OverridingWithException {
}
