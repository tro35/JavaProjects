// Given a string, compute recursively (no loops) a new string where
// all the lowercase 'x' chars have been changed to 'y' chars.

public class Strings {
    public static void main(String[] args) {
        String sentence = "xray xxxx xray xxxs xxjsjxssy";
        char from = 'x';
        char to = 'y';

        System.out.println(replace(sentence, from, to));
    }

    public static String replace(String s, char from, char to){
        if (s.length() < 1){
            return s;
        }
        else{
            char first = from == s.charAt(0) ? to : s.charAt(0);
            return first + replace(s.substring(1), from, to);
        }
    }
}
