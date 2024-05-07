package lambda;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/*
Predicate is a predefined function interface present in java.util.function package.
It has single abstract method i.e.
boolean test(T t);
 */

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = I -> I > 10;
        System.out.println(predicate.test(100));
        System.out.println(predicate.test(5));

        Predicate<String> p = s -> s.length() > 5;
        System.out.println(p.test("abcdef"));
        System.out.println(p.test("abc"));

        Predicate<Collection> predicate1 = c -> c.isEmpty();
        List<String> l1 = List.of();
        System.out.println(predicate1.test(l1));
        List<String> l2 = List.of("abc");
        System.out.println(predicate1.test(l2));
    }
}
