import javax.swing.text.AttributeSet.CharacterAttribute;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(createPalindrome("greenfox"));

    }
 
    public static String createPalindrome(String vstup){
        String result = "";        
        for (int i = vstup.length()-1; i >= 0; i--) {
            result += vstup.charAt(i);
        }
        return vstup += result;
    }
}
