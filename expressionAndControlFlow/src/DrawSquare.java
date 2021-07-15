// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was && j == 1 || j == input)
import java.util.Scanner;


public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int input = scanner.nextInt();
        

        for (int i = 1; i <= input; ++i){            
          {            
            for (int j = 1; j <= input; ++j) {  
                if(i== 1 || i == input)              
                System.out.print("%"); 
                
                else if((i > 1 || i < input) && (j > 1 && j < input))
                System.out.print(" ");
                else 
                System.out.print("%");
                       
          }
            System.out.println();
        }
        }
    }
}
