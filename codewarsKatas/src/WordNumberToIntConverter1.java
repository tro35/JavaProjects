import java.util.HashMap;
public class WordNumberToIntConverter1 {
    public static void main(String[] args) {
        String testValue = "seven hundred eighty-three thousand nine hundred and nineteen";
        System.out.println(wordToNumber(testValue));
    }
    static HashMap<String, Integer> numbers = new HashMap<String, Integer>();
    static HashMap<String, Integer> otherNumbers = new HashMap<String, Integer>();
    static HashMap<String, Integer> tenNumbers = new HashMap<String, Integer>();

    static {
        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);
        numbers.put("ten", 10);
        numbers.put("eleven", 11);
        numbers.put("twelve", 12);
        numbers.put("thirteen", 13);
        numbers.put("fourteen", 14);
        numbers.put("fifteen", 15);
        numbers.put("sixteen", 16);
        numbers.put("seventeen", 17);
        numbers.put("eighteen", 18);
        numbers.put("nineteen", 19);

        tenNumbers.put("twenty", 20);
        tenNumbers.put("thirty", 30);
        tenNumbers.put("forty", 40);
        tenNumbers.put("fifty", 50);
        tenNumbers.put("sixty", 60);
        tenNumbers.put("seventy", 70);
        tenNumbers.put("eighty", 80);
        tenNumbers.put("ninety", 90);

        otherNumbers.put("hundred", 100);
        otherNumbers.put("thousand", 1000);
        otherNumbers.put("million", 1000000);
        otherNumbers.put("billion", 1000000000);
    }

    private static long wordToNumber(String wordNumber){
        long result = 0;
        Integer temp = null;
        Integer previous = 0;        
        wordNumber = wordNumber.replaceAll("-", " ");
        wordNumber = wordNumber.replaceAll(" and", " ");
        String[] splittedWordNumber = wordNumber.trim().split("\\s+");

        for(String split: splittedWordNumber){
            if(numbers.get(split) != null){
                temp = numbers.get(split);
                result = result + temp;
                previous = previous + temp;
            }
            else if(otherNumbers.get(split) != null){
                if(result != 0){result = result - previous;}
                result = result + (long)previous * (long)otherNumbers.get(split);
                temp = null;
                previous = 0;
            }
            else if(tenNumbers.get(split) != null){
                temp = tenNumbers.get(split);
                result = result + temp;
                previous = temp;
            }
        }
        return result;
    }
}
