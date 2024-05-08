package lambda.function;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionDemo {
    public static void main(String[] args) {
        IntToDoubleFunction function = i -> Math.sqrt(i);
        System.out.println(function.applyAsDouble(10));
    }
}
