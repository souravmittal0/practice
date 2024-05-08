package lambda.function;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> p = (a,  b) -> a * b;
        System.out.println(p.apply(10, 20));
    }
}
