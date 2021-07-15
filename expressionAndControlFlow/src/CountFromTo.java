// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
// 
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

import java.util.Scanner;



public class CountFromTo {
    public static void main(String[] args) {

    
    
    boolean pokracovat = true;
    
     while(pokracovat){
     Scanner scanner1 = new Scanner(System.in);
         
     System.out.print("Enter number 1: ");  
      int input = scanner1.nextInt();

     System.out.print("Enter number 2: ");  
      int input2 = scanner1.nextInt();

        
      if(input < input2){
       
            for (int i = input; i < input2; i++) {
                
                System.out.println(i); 
            }
            pokracovat = false;
        }
      else         
         System.out.println("The second number should be bigger");
                 
        }
      }  
    }
  