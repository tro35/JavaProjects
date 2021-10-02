import java.util.HashMap;
public class WordNumberToIntConverter3 {
    public static void main(String[] args) {
        String testValue = "seven hundred eighty-three thousand nine hundred and nineteen";
        System.out.println(wordToNumber(testValue));
    }
    static HashMap<String, Integer> numbers = new HashMap<String, Integer>();
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
        numbers.put("twenty", 20);
        numbers.put("thirty", 30);
        numbers.put("forty", 40);
        numbers.put("fifty", 50);
        numbers.put("sixty", 60);
        numbers.put("seventy", 70);
        numbers.put("eighty", 80);
        numbers.put("ninety", 90);
        numbers.put("hundred", 100);
        numbers.put("thousand", 1000);
        numbers.put("million", 1000000);
        numbers.put("billion", 1000000000);
    }
    private static long wordToNumber(String wordNumber){
        long result = 0;
        long finalResult = 0;        
        wordNumber = wordNumber.replaceAll("-", " ");
        wordNumber = wordNumber.replaceAll(" and", " ");
        String[] splittedWordNumber = wordNumber.trim().split("\\s+");
        for(String str : splittedWordNumber)
            {
                if(numbers.get(str) >= 0  && numbers.get(str) < 100) {
                    result += numbers.get(str);
                }                
                else if(numbers.get(str) == 100 ){
                    result *= 100;
                }
                else if(numbers.get(str) == 1000) {
                    result *= 1000;
                    finalResult += result;
                    result=0;
                }
                else if(numbers.get(str) == 1000000) {
                    result *= 1000000;
                    finalResult += result;
                    result=0;
                }
                else if(numbers.get(str) == 1000000000) {
                    result *= 1000000000;
                    finalResult += result;
                    result=0;
                }
                else if(numbers.get(str) == 1000000000) {
                    result *= 1000000000;
                    finalResult += result;
                    result=0;
                }
            }
            finalResult += result;
            result=0;
            return finalResult;
        }
}
