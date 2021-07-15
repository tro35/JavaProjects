import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //stream nahragi tento zapis a pposkytne stejny vysledek, ale zapis je kratsi
        for(Integer number : myList){
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
        //stream poskytuje hodnoty z listu jednu po druhe
        //se streamem lze delat dve zakladni operace: stredne pokrocile nebo ukoncovaci terminal operations
        //stredne pokrocile operace manipuluji s hodnotami
        //do streamu napiseme lambda vyraz a doshneme stejneho vysledku jako for loop nahore

        myList.stream().filter(number -> number % 2 == 0)
                //stream stale existuje muze se pouzit nekolik filtru
                .filter(number -> number > 5)
                .forEach(number -> System.out.println(number));

        //ukoncovaci operace jakmile je operace pouzita stream prestava existovat
        //timto zpusobem muzeme data ze streamu poslat nekam jinam
        //ve streamu muzeme transformovat data nelze delat mutace
        //data co pritecou do streamu nelze menit

        List<Integer> filteredNumbers = myList.stream().filter(number -> number % 2 == 0)
                //stream stale existuje muze se pouzit nekolik filtru
                .filter(number -> number > 5)
                //nejbeznejsi operace vezmi data ze streamu a uloz je do listu
                // v tomto pripade do filteredNumbers
                .collect(Collectors.toList());

        //transformace cisel na string
        //na leve strane funkce pred sipkou je vstup integer na prave strane se meni na string
        //diky funkci map
        //map sama pozna jestli ma probehnout transformace na string nebo na cislo nebo na neco jineho
        myList.stream().map(number -> "Value element of this stream is " + number)
        .forEach(descriptionString -> System.out.println(descriptionString));

        //ulozeni konverze do listu stringu
        List<String> descriptionStrings = myList.stream().map(number -> "Value element of this stream is " + number)
                .collect(Collectors.toList());

        //distinct vybere unikatni hodnoty ze streamu vynecha duplikaty
        List<Integer> listWithDuplicates = Arrays.asList(1,1,2,3,4,4,5,6,7,8,8,9,10,10);

        listWithDuplicates.stream().distinct().forEach(number -> System.out.println(number));

        //sort tridi hodnoty ve streamu od nejmensi po nejvyssi
        List<Integer> listWithDuplicates1 = Arrays.asList(45,50,100,87,-4,-5,47);
        listWithDuplicates1.stream().sorted().forEach(number -> System.out.println(number));

        //sort muze tridit i objekty napr objekty vytvorene z tridy student
        //pokud lambda bere vice nez dva parametry musi byt v zavorkach
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Tom"));
        studentList.add(new Student("Honza"));
        studentList.add(new Student("Andrea"));

        studentList.stream().sorted((element1, element2) -> element1.getName().compareTo(element2.getName()))
                .forEach(student -> System.out.println(student.getName()));
        //peek jednotlive prikazy radit takhle pod sebe
        myList.stream()
                .filter(number -> number < 4)
                .peek(number -> System.out.println(number))
                .filter(number -> number%2==0)
                .forEach(number -> System.out.println(number));

        //reduce vezme cely stream a udela z nej jednu hodnotu, hodi se to pokud treba chceme udelat soucet
        //vsech hodnot, reduce bere dva parametry prvni je startovni bod odkud chceme zacit zpracovavat data
        //
        Integer sum = myList.stream()
                .filter(number -> number < 4)
                .reduce(0,Integer::sum);
        System.out.println(sum);

        //limit vrati prvni ctyri hodnoty v tomto pripade musi byt sum1 typ optional
        //protoze max vraci optional
        Optional<Integer> sum1 = myList.stream()
                .filter(number -> number < 4)
                .limit(4)
                .max(Integer::compareTo);
        System.out.println(sum1);
    }
}
