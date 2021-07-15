import java.util.*;

import java.util.Scanner;
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "Cannot divide by zero!" if the parameter is 0

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        float divisor = scanner.nextFloat();
        System.out.println(Division(divisor));
    }

    public static String Division(float vstup) {
        String vystup = "";
        float result = 0;
        try { // Prevents the program breaking when attempting dividing by zero
            result = 12 / vstup; // If the input value for divisor was 0 it stops the try block
            vystup = Float.toString(result);
             // The program doesn't reach this line if the input was 0
        } catch (ArithmeticException e) {
            vystup = "Can't divide by zero!"; // This line only runs if the input was 0
        }
        return (vystup);
    }
}









