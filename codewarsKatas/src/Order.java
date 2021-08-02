/*Your task is to sort a given string. Each word in the string will contain a single number.
  This number is the position the word should have in the result.
  Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
  If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
  Examples
  "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
  "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
  ""  -->  ""
  */

public class Order {
    public static void main(String[] args) {
        String result = order("");
        System.out.println(result);
    }

    public static String order(String words) {
        String outputString = "";
        String splitedStrings[] = words.split(" ");
        String resultArray[] = new String[splitedStrings.length];

        for (int i = 0; i < splitedStrings.length; i++) {
            if (resultArray.length > 1)
                resultArray[extractInt(splitedStrings[i]) - 1] = splitedStrings[i];
            else
            resultArray = null;
        }
        if (resultArray != null) {
            for (int i = 0; i < resultArray.length; i++) {
                outputString += resultArray[i] + " ";
            }
        } else {
            outputString += "";
        }
        return outputString.trim();
    }

    public static int extractInt(String str) {
        // Replacing every non-digit number
        // with a space(" ")
        str = str.replaceAll("[^\\d]", " ");

        // Remove extra spaces from the beginning
        // and the ending of the string
        str = str.trim();

        // Replace all the consecutive white
        // spaces with a single space
        str = str.replaceAll(" +", " ");

        if (str.equals(""))
            return -1;

        return Integer.parseInt(str);
    }
}
