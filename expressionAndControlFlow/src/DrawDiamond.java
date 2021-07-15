// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int input = scanner.nextInt();
        int c = 0;

        for (int i = 1; i <= input; ++i, c = 0) {
            for (int space = 1; space <= input - i; ++space) {
                System.out.print(" ");
            }

            while (c != 2 * i - 1) {
                System.out.print("*");
                ++c;
            }

            System.out.println();
        }

        
        int temp = input;
        

        for (int i = 1; i <= input; ++i, c = 0) {
            for (int space = 1; space <= 0 + i - 1; ++space) {
                System.out.print(" ");
            }
            
            while (c != 2 * temp - 1) {
                System.out.print("*");
                ++c;                
            }
            temp = temp -1;

            System.out.println();
        }
    }
}
