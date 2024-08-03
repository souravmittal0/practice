package binarysearch;

public class DecimalSquareRoot {
    public static void main(String[] args) {
        int num = 10;
        double l = 1, r = num;
        int cnt = 0;
        while (r - l > (double)1e-6) {
            double mid = (l + r) / 2;
            if (mid * mid <= num) {
                l = mid;
            }
            else {
                r = mid;
            }
        }
        System.out.println("Either of l and r can be answer: L: " + l);
        System.out.println("Either of l and r can be answer: R: " + r);
    }
}
