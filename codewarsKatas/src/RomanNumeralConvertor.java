import java.util.Map;

import java.util.Map;
import java.util.HashMap;
public class RomanNumeralConvertor {
    public static void main(String[] args) {
        String input = "MCMIV";
        int number = 1768;
        System.out.println(convertRomanToInteger(input));
        System.out.println(convertNumberToRoman(number));
    }

    private static Map<Character, Integer> romanNumbers = new HashMap<Character, Integer>(){
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    private static int convertRomanToInteger(String romanNumber){
        int sum = 0;
        int n = romanNumber.length();
        for (int i = 0; i < n; i++) {
            if(i != n - 1 && romanNumbers.get(romanNumber.charAt(i)) < romanNumbers.get(romanNumber.charAt(i + 1))){
                sum += romanNumbers.get(romanNumber.charAt(i + 1)) - romanNumbers.get(romanNumber.charAt(i));
                i++;
            }
            else{
                sum += romanNumbers.get(romanNumber.charAt(i));
            }
        }
        return sum;
    }

    private static String convertNumberToRoman(int number){
        String m[] = {"", "M", "MM", "MMM"};
        String c[] = {"", "C", "CC", "CCC", "CD", "D","DC", "DCC", "DCCC", "CM"};
        String x[] = {"", "X", "XX", "XXX", "XL", "L","LX", "LXX", "LXXX", "XC"};
        String i[] = {"", "I", "II", "III", "IV", "V","VI", "VII", "VIII", "IX"};
        String thousands = m[number/1000];
        String hundereds = c[(number%1000)/100];
        String tens = x[(number%100)/10];
        String ones = i[number%10];             
        String result = thousands + hundereds + tens + ones;             
        return result;
    }
}
