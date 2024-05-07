package lambda.supplier;

import java.util.function.Supplier;

/*
Password:
Length: 8
Digits at 2,4,6,8 places
Uppercase letters & symbols (@ # $) at 1,3,5,7
 */
public class PasswordGenerator {
    public static void main(String[] args) {
        Supplier<String> password = () -> {
            StringBuilder pwd = new StringBuilder();
            Supplier<Integer> digit = () -> (int) (Math.random() * 10);
            String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
            Supplier<Character> c = () ->
                    allowedChars.charAt(((int) (Math.random() * 29)));
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    pwd.append(digit.get());
                }
                else {
                    pwd.append(c.get());
                }
            }
            return pwd.toString();
        };
        System.out.println(password.get());
    }
}
