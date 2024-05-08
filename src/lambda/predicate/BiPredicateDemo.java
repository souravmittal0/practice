package lambda.predicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> predicate = (a, b) -> (a + b) % 2 == 0;
        System.out.println(predicate.test(10, 20));
    }
}
