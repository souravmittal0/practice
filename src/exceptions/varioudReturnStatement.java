package exceptions;

public class varioudReturnStatement {

    public static void main(String[] args) {
        System.out.println(check());
    }

    public static int check() {
        try {
            return 1;
        } catch (Exception ex) {
            return 2;
        }
        finally {
            return 3;
        }
//        return 0; //unreachable statement
    }
}
