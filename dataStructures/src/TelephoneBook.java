/*Create an application which solves the following problems.

What is John K. Miller's phone number?
Whose phone number is 307-687-2982?
Do we know Chris E. Myers' phone number?*/


import java.util.HashMap;
import java.util.Map.Entry;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> telephoneNumbers = new HashMap<String, String>();

        telephoneNumbers.put("William A. Lathan", "405-709-1865");
        telephoneNumbers.put("John K. Miller","402-247-8568");
        telephoneNumbers.put("Hortensia E. Foster","606-481-6467");
        telephoneNumbers.put("Amanda D. Newland","319-243-5613");
        telephoneNumbers.put("Brooke P. Askew","307-687-2982");
        
               
        

        //What is John K. Miller's phone number?    
        if(telephoneNumbers.containsKey("John K. Miller")){
            String number = telephoneNumbers.get("John K. Miller");
            System.out.println(number);            
        }

        //Whose phone number is 307-687-2982?
        String number = "307-687-2982";

        for(Entry<String, String> entry: telephoneNumbers.entrySet()) {

            // if give value is equal to value from entry
            // print the corresponding key
            if(entry.getValue() == number) {
              System.out.println("The key for value " + number + " is " + entry.getKey());
              break;
            }
          }
            
          //Do we know Chris E. Myers' phone number?
          if(telephoneNumbers.containsKey("Chris E. Myers")){
            String number1 = telephoneNumbers.get("Chris E. Myers");
            System.out.println(number1);         
        }
        else 
        System.out.println("Phone number doesnt exist");
    }
}