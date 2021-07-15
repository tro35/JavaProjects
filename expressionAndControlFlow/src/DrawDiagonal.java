// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

import java.util.Scanner;


public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int input = scanner.nextInt();


        for (int i = 0; i < input; i++) {


            for (int j = 0; j < input; j++) {
                if (i == 0 || i == input - 1) {
                    System.out.print("%");
                }

                if (i > 0 && i < input - 1) {
                    if (j == 0 || j == input - 1) {
                        System.out.print("%");
                    } else if (i == j) {
                        System.out.print("%");

                    } else {
                        System.out.print(" ");
                    }
                }

            }

            System.out.println();
        }



    }
}

