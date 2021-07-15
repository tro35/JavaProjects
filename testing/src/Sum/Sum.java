package Sum;


import java.util.ArrayList;
import java.util.List;

public class Sum {

    public int sumList(){
        int result = 0;
        for (int i = 0; i < initializeList().size(); i++) {
            result += initializeList().get(i);
        }
        return result;
    }



    private List<Integer> initializeList(){
        ArrayList<Integer> arl = new ArrayList<>();
        arl.add(5);
        arl.add(10);
        arl.add(85);
        return arl;
    }
}
