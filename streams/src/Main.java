import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*Optional kontroluje napriklad pokud metoda vrati retezec z databaze
        jestli vrati retezec nebo prazdnou hodnotu nemusi se kontrolovat konkretni
        hodnota vraceneho retezce
         */
        Optional<String> result = Optional.of("Tomas Rolny");
        Optional<String> emptyResult = Optional.empty();
        //Optional<Student> student = Optional.of(new Student());

        if(emptyResult.isPresent()){
            System.out.println(emptyResult.get());
        }else{
            System.out.println("My optional is empty");
        }

        //Lambda je funkce ktera muze byt ulozena jako promenna

        result.ifPresent(value -> System.out.println(value));
        //tento lambda vyraz rika podivej se do main a najdi funkci printString a pouzij ji
        result.ifPresent(Main::printsString);
        //v lambda funkci muze byt vice parametru jako u metody
        //v tomto pripade jen jen jeden protozw ifPresent ma pouze jeden vstupni parametr
        result.ifPresent(stringInside -> {
            String upperCasedString = stringInside.toUpperCase();
            String [] words = upperCasedString.split(" ");
            System.out.println(words[1]);
        });
    }
    public static void printsString(String value){
        System.out.println(value);
    }

}
