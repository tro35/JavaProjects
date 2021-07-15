import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class PersonalFinance {
    public static void main(String args[]) {
        ArrayList<Integer> ListA = new ArrayList<Integer>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        Collections.sort(ListA);

        double sum = 0;
        double average = 0;
        
        for (int i = 0; i < ListA.size(); i++) {
                if(i == 0){            
                System.out.println("Our cheapest spending " + ListA.get(i));
                }
                if(i == (ListA.size()-1)){ 
                System.out.println("Our most expensive spending " +ListA.get(i));                     
                }                
                sum += ListA.get(i);                
            }
            System.out.println("We spend " + sum); 
            average = sum / ListA.size() + 1;
            System.out.println("Average amount " + average);          
        
    }
}


