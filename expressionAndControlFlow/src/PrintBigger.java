import java.util.Scanner;


public class PrintBigger {
  public static void main(String[] args) {
   // Write a program that asks for two numbers and prints the bigger one
   Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number 1: ");  
      int  input = scanner.nextInt();
    System.out.print("Enter number 2: ");  
      int  input1 = scanner.nextInt();
    
    if(input > input1)
    System.out.println("Number 1 is bigger than number 2 " + input);
    else
    System.out.println("Number 2 is bigger than number 1 " + input1);

  }
}