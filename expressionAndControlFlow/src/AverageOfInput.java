import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4

    Scanner scanner = new Scanner(System.in);

    int number = 1;

      System.out.print("Enter number " + number++ + " : ");  
      int  input = scanner.nextInt();

      System.out.print("Enter number " + number++ + " : ");  
      int  input1 = scanner.nextInt();

      System.out.print("Enter number " + number++ + " : ");  
      int  input2 = scanner.nextInt();

      System.out.print("Enter number " + number++ + " : ");  
      int  input3 = scanner.nextInt();

      System.out.print("Enter number " + number + " : ");  
      int  input4 = scanner.nextInt();

      int sum = input + input1 + input2 + input3 + input4;
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + ((float)sum/number));

  }
}