import java.util.Arrays;
import java.util.List;

public class EX4averageOddNum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        numbers.stream()
                .filter(number -> number % 2 == 1)
                .mapToInt(number -> number)
                .average()
                .ifPresent(avg -> System.out.println("Average is: " + avg));
    }
}
