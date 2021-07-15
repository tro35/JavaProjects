// Create the usual class wrapper and main method on your own

// Write a function called `sum()` that returns the sum of numbers from zero to the given parameter

public class Sum {
    public static void main(String[] args) {
        

        
            sum(10);
        
    }
        // function sums all numbers from zero to input parameter
        public static void sum(int input) {
            int result = 0;
            int[] numbers = new int [input];

            //fill array with values
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i + 1;               
            }

            //sum all elements of array
            for (int i = 0; i < numbers.length; i++) {
                result = result + numbers[i];
            }
            
            System.out.println(result);
          }
    
}
