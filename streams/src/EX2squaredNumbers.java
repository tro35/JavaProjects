import java.util.Arrays;
import java.util.List;

public class EX2squaredNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        numbers.stream()
                .filter(number -> number > 0)
                .forEach(number -> System.out.println((int)(Math.pow(number, 2))));

        List<Integer> numbers1 = Arrays.asList(3, 9, 2, 8, 6, 5);

        numbers1.stream()
                .filter(number -> number * number > 20)
                .forEach(number -> System.out.println(number));
    }
}
