// Given a string,
// compute recursively a new string where
// all the adjacent chars are now separated by a `*`

public class StringsAgain3 {
    public static void main(String[] args) {
     String text = "hello world";
     System.out.println(adjacent(text));
    }
    public static String adjacent(String s){
        if(s.length() == 1)
            return s;
        return s.charAt(0) + "*" + adjacent(s.substring(1));
    }
}
