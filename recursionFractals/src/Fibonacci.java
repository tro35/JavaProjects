// The fibonacci sequence is a famous bit of mathematics,
// and it happens to have a recursive definition.
// The first two values in the sequence are 0 and 1 (essentially 2 base cases).
// Each subsequent value is the sum of the previous two values,
// so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
// Define a recursive fibonacci(n) method that
// returns the nth fibonacci number,
// with n=0 representing the start of the sequence.

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int number){
        System.out.println("Current value of num:" + number);
        if (number <= 1)
            return number;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
