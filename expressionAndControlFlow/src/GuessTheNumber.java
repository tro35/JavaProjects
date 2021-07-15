// Write a program that stores a number and the user has to figure it out
// The user can input guesses
// After each guess the program would tell one of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("GUESS THE NUMBER!");

        int number = rand.nextInt(100);

        int input = 0;

        while (input != number) {
            System.out.print("Enter number: ");
            int input1 = scanner.nextInt();

            if (input1 > number)
                System.out.println("The stored number is lower");

            else if (input1 < number)
                System.out.println("The stored number is higher");

            else if (input1 == number)
                System.out.println("You found number: " + number + " !");

            input = input1;

        }

    }
}