import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EX8concateToString {
    public static void main(String[] args) {
        List<Character> myList = Arrays.asList('a','h','o','j',' ','h','e','l','l','o');

        String joinedWord = myList.stream()
                                .map(String::valueOf)
                                .collect(Collectors.joining());

        System.out.println(joinedWord);

    }
}
