import java.util.Scanner;

public class EX6uppercaseChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please give a string: ");
       //Uppercase
        String isUp = in.next()
                .chars()
                .filter(Character::isUpperCase)
                .collect(StringBuilder::new, // supplier
                        StringBuilder::appendCodePoint, // accumulator
                        StringBuilder::append) // combiner
                .toString();
        System.out.println("The uppercase characters are " + isUp);
    }
}
