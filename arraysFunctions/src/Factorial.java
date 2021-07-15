//  Create the usual class wrapper and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input

public class Factorial {
    public static void main(String[] args) {
        

        
            calculateFactorial(10);
        
    }
        // 
        public static void calculateFactorial(int input) {
            long result = 1;
            int[] numbers = new int [input];

            //fill array with values
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i + 1;               
            }

            // computing factorial 
            if (input > 0){
                for (int i = 0; i < numbers.length; i++) {
                    result = result * numbers[i];
                }
            }
            else{
                result = 1;
            }            
            System.out.println("Factorial for number: " + input + " is " + result);
          }
    
}
