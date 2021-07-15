// Write a program that asks for a number
// It would ask this many times to enter an integer
// If all the integers are entered it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
import java.util.Scanner;

public class ParametricAverage{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter count of numbers: ");
        int input = scanner.nextInt();
        
        int counter = 0;
        float sum = 0;
        int index = 0;
        int[] numbers = new int [input];

        while(input != counter){            
            System.out.print("Enter number: ");
            int input1 = scanner.nextInt();
            
            numbers[index] = input1;

            index ++;
            counter ++;

        }

        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];}
            float average = sum / numbers.length;

            System.out.println("Sum: " + (int)sum + ", Average: " + average);
        
    }

}