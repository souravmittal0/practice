package lambda.function;

import java.util.function.ToIntFunction;

public class ToIntFunctionDemo {
    public static void main(String[] args) {
        //Returns int but takes input as mentioned in type argument
        ToIntFunction<String> f = s -> s.length();
        System.out.println(f.applyAsInt("abc"));
    }
}
