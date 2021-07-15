import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EX9findCharactersString {
    public static void main(String[] args) {
        String sentence = "streams are very usefull fjkreidnsddasm wrqjsmdljsmsm";

        Stream.of(sentence.toLowerCase().split(""))
                .collect(Collectors.groupingBy(e -> e,Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey()+e.getValue()+" ")
                .forEach(System.out::println);
    }
}
