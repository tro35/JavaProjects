import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
      // Write a program that asks for two integers
      // The first represents the number of chickens the farmer has
      // The second represents the number of pigs owned by the farmer
      // It should print how many legs all the animals have
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter number of chickens: ");  
      int chickenInput = scanner.nextInt();

      System.out.print("Enter number of pigs: ");  
      int pigInput = scanner.nextInt();

      System.out.println("All animals have " + ((chickenInput * 2) + (pigInput * 4)) + " legs"); 

    }
  }