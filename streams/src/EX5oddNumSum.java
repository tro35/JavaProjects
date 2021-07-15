import java.util.Arrays;
import java.util.List;

public class EX5oddNumSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        int sum1 = numbers.stream()
                .filter(number -> number % 2 == 1)
                .mapToInt(number -> number)
                .sum();
                System.out.println("Sum is: " + sum1);
    }
}
