package lambda.function;

import java.util.function.IntFunction;

public class IntFunctionDemo {
    public static void main(String[] args) {
        IntFunction<Integer> function = i -> i * i; //Integer is return type
        System.out.println(function.apply(10));
    }
}
