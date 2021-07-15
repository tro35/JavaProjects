// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
import java.util.Scanner;

public class DrawTriangle 
{
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");  
        int input = scanner.nextInt();
        String star = ""; 

        int counter = 0;
        while(counter < input)
        {                              
            System.out.println(star);
            star += "*";
            counter++;
        }

    }
}