// Create a method that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.


public class Reverse {
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        reverse(toBeReversed);


        }
        public static void reverse (String input){
            String c = "";
            for (int i = input.length()-1; i >= 0; i--) {
                
                c = c + input.charAt(i);
            }
            System.out.println(c);
    }
}
