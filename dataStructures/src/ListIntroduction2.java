/*Create a list ('List A') which contains the following values
Apple, Avocado, Blueberries, Durian, Lychee
Create a new list ('List B') with the values of List A
Print out whether List A contains Durian or not
Remove Durian from List B
Add Kiwifruit to List A after the 4th element
Compare the size of List A and List B
Get the index of Avocado from List A
Get the index of Durian from List B
Add Passion Fruit and Pomelo to List B in a single statement
Print out the 3rd element from List A */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class ListIntroduction2 {
    
    public static void main(String args[]) {
        ArrayList<String> ListA = new ArrayList<String>();
        ArrayList<String> ListB = new ArrayList<String>();
        ArrayList<String> ListC = new ArrayList<String>();

        ListC.add("Passion Fruit");
        ListC.add("Pomelo");


        //Add elements to ListA
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Bluberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        //Add all to ListB
        ListB.addAll(ListA);


        //Contains Durian?
        
            if(ListA.contains("Durian")){
            System.out.println("ListA contains Durian");
            }            
        
        //Remove Durian from ListB
        ListB.remove("Durian");

        //Add Kiwifruit to List A after the 4th element
        for (int i = 0; i < ListA.size(); i++) {
            if(i == 3){
            ListA.add(4,"Kiwifruit");
            }            
        }

        //Compare size
        if (ListA.size() != ListB.size()) {
            System.out.println("Lists have different size");             
        }

        //Get the index of Avocado from ListA        
            System.out.println(ListA.indexOf("Avocado"));

        //Get the index of Durian from List B
            System.out.println(ListB.indexOf("Durian"));

        //Add Passion Fruit and Pomelo to List B in a single statement 
        //Dotaz Luk
        ListB.addAll(ListC);

        //Print 3rd element from list A
        for (int i = 0; i < ListA.size(); i++) {
            if(i == 2){
                System.out.println(ListA.get(i));
            }            
        }



        //Control print
        for (int i = 0; i < ListB.size(); i++) {
            System.out.println(ListB.get(i));            
        }

        System.out.println();
        
        for (int i = 0; i < ListA.size(); i++) {
            System.out.println(ListA.get(i));            
        }
    }
}
