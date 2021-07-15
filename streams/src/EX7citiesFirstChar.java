import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX7citiesFirstChar {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        Scanner in = new Scanner(System.in);
        System.out.print("Please give a starting char: ");
        String letter = in.next();

        cities.stream()
                .filter(name -> name.startsWith(letter))
                .forEach(name -> System.out.println(name));

    }

}
