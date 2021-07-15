// Given a string,
// compute recursively a new string where
// all the 'x' chars have been removed.

public class StringsAgain {
    public static void main(String[] args) {
        String sentence = "xray xxxx xray xxxs xxjsjxssy";
        char removedChar = 'x';


        System.out.println(remove(sentence, removedChar));
    }

    public static String remove(String s, char removedChar) {
        if (s.length() < 1) {
            return s;
        } else {
            if (s.charAt(0) == removedChar) {
                return remove(s.substring(1), removedChar);
            }
            return s.charAt(0) + remove(s.substring(1), removedChar);
        }
    }
}
