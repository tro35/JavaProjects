import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class ListIntroduction1 {
    
    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("TOM");
        names.add("John");
        names.add("Amanda");

        names.remove(1);
        //remove all elements from array
        //names.removeAll(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " + names.get(i));
            
        }
        //System.out.println(names.get(1));
        System.out.println(names.size());
    }
}
