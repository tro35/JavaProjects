/*Create a list with the following items.
Eggs, milk, fish, apples, bread and chicken
Create an application which solves the following problems.
Do we have milk on the list?
Do we have bananas on the list?*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ShoppingList {
    
    public static void main(String args[]) {

        

        Scanner itemInput = new Scanner(System.in);
          
        System.out.println("Enter item: ");
        String itemName = itemInput.nextLine();

        System.out.println(shoppignListSearch(itemName));
        
    }

    public static String shoppignListSearch(String input){
        String output = "";

        ArrayList<String> shoppingItems = new ArrayList<String>();
        Collections.addAll(shoppingItems, "eggs", "milk", "fish", "apples", "bread", "chicken");

        if(shoppingItems.contains(input)){
            output = "Shopping list contains " + input;
            }
            else{
                output = "Shopping list doesnt contains " + input;
            }
            return String.format(output);
    }
}