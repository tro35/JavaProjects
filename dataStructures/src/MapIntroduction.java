import java.util.HashMap;

public class MapIntroduction {
    public static void main(String[] args) {
        HashMap<Integer, Character> hm = new HashMap<Integer, Character>();

        hm.put(97,'a');
        hm.put(98,'b');
        hm.put(99,'c');
        hm.put(65,'A');
        hm.put(66,'B');
        hm.put(67,'C');
        hm.put(68,'D');
        hm.remove(97,'a');

        //iterating hash map
        for(Integer key: hm.keySet())
            System.out.println(key+":"+hm.get(key));

        //print hashmap size
        System.out.println(hm.size());

        if(hm.containsKey(99))
            System.out.println("Hash map contains key " + 99);

        if(hm.containsKey(100))
            System.out.println("Hash map contains key " + 100);
        else
            System.out.println("Hash map doesnt contains key " + 100);

        //remove all elements from hashmap
        hm.clear();

        System.out.println(hm.size());
    }
}
