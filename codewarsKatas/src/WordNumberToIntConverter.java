public class WordNumberToIntConverter {
    public static void main(String[] args) {
        int testValue = 246;
        System.out.println(convertNumberToText(testValue));
    }

    private static String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                                     "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static String[] tens = {"","","twenty","forty","fifty","sixty","seventy","eighty","ninety"};

    private static String convertNumberToText(int number){        
            if (number < 0){
                return "minus " + convertNumberToText( - number);
            }                
            if (number < 20){
                return units[number];
            }
            if (number < 100){
                return tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
            }             
            if (number < 1000){
                return units[number / 100] + " hundred" + ((number % 100 != 0) ? " " : "" ) + convertNumberToText(number % 100);
            }             
            if (number < 1000000){
                return units[number / 1000] + " thousand" + ((number % 1000 != 0) ? " " : "" ) + convertNumberToText(number % 1000);
            }            
            if (number < 1000000000){
                return units[number / 1000000] + " million" + ((number % 1000000 != 0) ? " " : "" ) + convertNumberToText(number % 1000000);
            }           
            return units[number / 1000000000] + " billion" + ((number % 1000000000 != 0) ? " " : "" ) + convertNumberToText(number % 1000000000);             
        }
    }

