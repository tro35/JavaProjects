import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class EX10Foxes {
    public static void main(String[] args) {
        List<Fox> foxList = new ArrayList<>();
        foxList.add(new Fox("Fox1","Blue",10));
        foxList.add(new Fox("Fox2","Green",2));
        foxList.add(new Fox("Fox3","Green",6));
        foxList.add(new Fox("Fox4","Red",15));
        foxList.add(new Fox("Fox5","Yellow",7));
        foxList.add(new Fox("Fox6","Orange",20));

        foxList.stream()
                .filter(e -> e.getColor().equals("Green"))
                .forEach(e -> System.out.println(e.getName()+ " " + e.getColor()));

        foxList.stream()
                .filter(e -> e.getColor().equals("Green"))
                .filter(e -> e.getAge() < 5)
                .forEach(e -> System.out.println(e.getName()+ " " + e.getColor()));

        foxList.stream()
                .collect(Collectors.groupingBy(e -> e.getColor(),Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey()+ " "+ e.getValue())
                .forEach(System.out::println);
    }
}
