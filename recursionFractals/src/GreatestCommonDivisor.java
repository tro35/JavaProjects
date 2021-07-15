// Find the greatest common divisor of two numbers using recursion.

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(commonDivisor(60, 45));
    }

    public static int commonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return commonDivisor(b, a % b);
    }
}
