import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        double distanceMiles = scanner.nextDouble();
        double kilometers = 1.609;

        System.out.println("Distance in kilometers is: " + distanceMiles * kilometers);
    }
}
