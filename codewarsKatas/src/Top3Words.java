import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.*;
public class Top3Words{
    public static void main(String[] args) {
        String sentence = ("In a village of La Mancha, the name of which I have no desire to call to\n" +
        "mind, there lived not long since one of those gentlemen that keep a lance\n" +
        "in the lance-rack, an old buckler, a lean hack, and a greyhound for\n" +
        "coursing. An olla of rather more beef than mutton, a salad on most\n" +
        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra\n" +
        "on Sundays, made away with three-quarters of his income.");
        String sentence1 = ("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e");
        System.out.println(top3(sentence1).toString());
        for (int i = 0; i < top3(sentence1).size(); i++) {
            System.out.println(i + " " + top3(sentence1).get(i));
        }
        
    }
    static HashMap<String, Integer> words = new HashMap<String, Integer>();

    public static List<String> top3(String s){         
        for (String string : fillMap(s)) {            
            words.put(string, words.get(string) + 1);
        }       
        List<String> keys = words.entrySet()
                                 .stream()
                                 .sorted(HashMap.Entry.<String, Integer>comparingByValue()                                 
                                 .reversed())
                                 .limit(3)                                 
                                 .map(HashMap.Entry::getKey)
                                 .collect(Collectors.toList());
        for (int i = 0; i < keys.size(); i++) {
            if(containWord(keys.get(i)) == 0){
                keys.remove(i);
            }
        }               
        return keys;        
    }

    public static String[] fillMap(String s){
        String[] splittedWords = s.toLowerCase().split("([,./\\s]+)");
        for (int i = 0; i < splittedWords.length; i++) {
            words.put(splittedWords[i], 0);
        }
        return splittedWords;
    }

    public static int containWord(String s){
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '\''){
                result += 1;
            }
        }
        return result;
    }    
}
//HashMap iteration//
/*for (HashMap.Entry<String, Integer> en : words.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                          ", Value = " + en.getValue());
        }*/