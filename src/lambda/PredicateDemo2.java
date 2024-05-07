package lambda;

import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        int[] nums = {0, 10, 15, 20, 25, 30};
        Predicate<Integer> predicate1 = i -> i > 10;
        Predicate<Integer> predicate2 = i -> i % 2 == 0;
        System.out.println("Numbers greater than 10");
        display(predicate1, nums);
        System.out.println("\nNumbers less than 10");
        display(predicate1.negate(), nums);
        System.out.println("\nEven Numbers");
        display(predicate2, nums);
        System.out.println("\nNumbers greater than 10 and even");
        display(predicate1.and(predicate2), nums);
        System.out.println("\nNumbers less than 10 and even");
        display(predicate1.negate().and(predicate2), nums);
        System.out.println("\nNumbers greater than 10 or even");
        display(predicate1.or(predicate2), nums);
    }

    public static void display (Predicate<Integer> predicate, int[] nums) {
        for (int num : nums) {
            if (predicate.test(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
