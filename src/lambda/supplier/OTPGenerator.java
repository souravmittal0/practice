package lambda.supplier;

import java.util.function.Supplier;

public class OTPGenerator {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 10);
        Supplier<String> otp = () -> {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < 6; i++) {
               s.append((int) (Math.random() * 10));
            }
            return s.toString();
        };
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
        System.out.println(otp.get());
    }
}
