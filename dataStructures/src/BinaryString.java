import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class BinaryString {
    public static void main(String[] args) {
        String decodedString = decode("11010111010011011100111111010111");
        String decodedString2 = decode("11100111010011011100111111010101");
        System.out.println(decodedString);
        System.out.println(decodedString2);
        HashMap<String, Integer> letterOccurencies = letterOccurencies(decodedString);
        System.out.println(letterOccurencies);
        loopOnHashMap(letterOccurencies);
        //for (int i = 0; i < letterBinaries.size(); i++) {
        //    System.out.println(letterBinaries.get(i));
        //}        
        //System.out.println(Arrays.toString(letters));
      }
    private static void loopOnHashMap (HashMap<String, Integer> letterOccurencies){
        //iteruje mapu vypise klice
        for (String key : letterOccurencies.keySet()) {
            System.out.println("key: " + key);
        }
        //iteruje mapu vypise hodnoty
        for (Integer value : letterOccurencies.values()) {
            System.out.println("value: " + value);
        }
        //iteruje mapu vypise klice a hodnoty
        for (Map.Entry<String, Integer> entry : letterOccurencies.entrySet()) {
            System.out.println("key: " + entry.getKey() + " , value: " + entry.getValue());
        }
    }
      
    private static HashMap<String, Integer> letterOccurencies(String decodedString){
        HashMap<String, Integer> letterOccurencies = new HashMap<>();
        for (int i = 0; i < decodedString.length(); i++) {
            String letter = decodedString.substring(i, i + 1);
            if(letterOccurencies.containsKey(letter)){
                letterOccurencies.put(letter, letterOccurencies.get(letter) + 1);
            } else {
                letterOccurencies.put(letter, 1);
            }            
        }
        return letterOccurencies;
    }

    private static String decode(String secretString){
        String [] chunks = separateToChunks(secretString);
        ArrayList<String> letterBinaries = filterOnlyLetters(chunks);
        int [] letters = convertBinariesToLetters(letterBinaries);
        String decodedString = concatenateLetters(letters);
        return decodedString;
    }

    private static String concatenateLetters(int [] charCodes){
        String decodedString = "";
        for (int charCode : charCodes) {
            char letter = (char) charCode;
            decodedString += letter;
        }
        return decodedString;
    }

    private static int calculateCharcode(String letterBinary){
        int charCode = 0;
        for (int i = 1; i < letterBinary.length(); i++) {
            int bit = Integer.parseInt(letterBinary.substring(i, i + 1));
            int exponent = letterBinary.length() - i - 1;
            int multiplier = (int) Math.pow(2, exponent);
            charCode += bit * multiplier;
        }
        return charCode;                                    
    }

    private static int[] convertBinariesToLetters(ArrayList<String> letterBinaries){
        int letterCodes[] = new int[letterBinaries.size()];
        for(int j = 0; j < letterBinaries.size(); j++){            
            String letterBinary = letterBinaries.get(j);
            int charCode = calculateCharcode(letterBinary);
            letterCodes[j] = charCode;            
            }        
        return letterCodes;
    }
 
    private static ArrayList<String> filterOnlyLetters(String[] chunks){
        ArrayList<String> letterBinaries = new ArrayList();
        for (int i = 0; i < chunks.length; i++) {
            if(chunks[i].charAt(0) == '1'){
                letterBinaries.add(chunks[i]);
            }
        }
        return letterBinaries;
    }

    private static String [] separateToChunks (String secretString) {
        int chunkSize = 8;
        int count = 0;
        String [] chunks = new String[secretString.length() / chunkSize];
        for (int i = 0; i < secretString.length(); i += chunkSize) {
            String chunk = secretString.substring(i, i + chunkSize);
            chunks[count] = chunk;
            count++;
        }
        return chunks;
    }
}
