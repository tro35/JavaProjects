import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input,
    // then prints "Odd" if the number is odd, or "Even" if it is even
    Scanner scanner = new Scanner(System.in);

    System.out.println("Odd and even number DETECTOR");
    System.out.print("Enter number: ");  
      int  input = scanner.nextInt();

      if(input % 2 == 0)
        System.out.println("It is even");
      else
        System.out.println("It is odd");
  }
}