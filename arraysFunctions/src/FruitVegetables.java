import java.util.Arrays;

import java.util.Scanner;

public class FruitVegetables{
    public static void main(String[] args) {
        String [] fruit = {"jablko", "hruška", "pomeranč", "jahoda", "banán", "kiwi", "malina"};
        String [] vegetables = {"zelí", "okurka", "rajče", "paprika", "ředkev", "mrkev", "brokolice"};
        
        findFV(fruit, vegetables);
    }

    private static void findFV(String [] fruit, String [] vegetables){
        Scanner sc = new Scanner(System.in, "Windows-1250");
        String input = "";
        int counter = 0;

        while(!input.equals("ne")){            
            System.out.println("Zadej název libovolného ovoce nebo zeleniny: ");
            input = sc.nextLine().trim().toLowerCase();
            int fru = indexOf(fruit, input);
            int veg = indexOf(vegetables, input);

            if(fru > -1)
              System.out.println("Zadal jsi ovoce");
            else if (veg > -1)
               System.out.println("Zadal jsi zeleninu");
            else               
            System.out.println("Tvoje slovo nemám v seznamu");
            
            System.out.println("Přeješ si zadat další slovo? (ano/ne)");
            input = sc.nextLine().trim().toLowerCase();
            counter++;
            if(!input.equals("ano")){
                System.out.println("Zadal jsi " + counter + " slov");
            }
        }
    }

    private static int indexOf(Object[] strArray, Object element){
         /*
         * Convert array to List and then
         * use indexOf method of List class.
         */
        int index = Arrays.asList(strArray).indexOf(element);
        return index;

    }

}