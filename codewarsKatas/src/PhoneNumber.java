public class PhoneNumber {
    public static void main(String[] args) {
        String returnedResult = createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(returnedResult);
    }
    public static String createPhoneNumber(int[] numbers){
        String outputString = "";
        for (int i = 0; i < numbers.length; i++) {            
               outputString += numbers[i];                        
        }
        outputString = outputString.substring(0,0) + "(" + outputString.substring(0, 3) + ") "
                       + outputString.substring(3, 6) + "-" + outputString.substring(6, outputString.length());
        return outputString;
    }
}
