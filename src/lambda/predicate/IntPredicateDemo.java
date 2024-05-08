package lambda.predicate;

import java.util.function.IntPredicate;

public class IntPredicateDemo {
    public static void main(String[] args) {
        int[] nums = {0, 10, 15, 20, 25, 30};
        IntPredicate p = i -> i % 2 == 0;
        for (int n : nums) {
            if (p.test(n)) {
                System.out.println(n);
            }
        }
    }
}
