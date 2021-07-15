import java.util.Scanner;

public class HappyText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Zadej text k rozveselení: ");
        String input = sc.nextLine().trim();

        String[] smajlici = { ":)", ":D", ":P" };
        String intP = "!?.";

        int smajliciP = 0;
        int place = 0;

        while (place < input.length())
        {

            if (intP.contains(String.valueOf(input.charAt(place)))){
                if (input.charAt(place) == '.'){
                    input = input.substring(0, place) + input.substring(place + 1);
                    place--;
                }
                input = input.substring(0, place + 1) + " " + smajlici[smajliciP] + input.substring(place + 1);
                place++;
                smajliciP++;
                if (smajliciP > smajlici.length - 1){
                    smajliciP = 0;
                }
            }
            place++;
        }
        System.out.format("Rozveselený text: %s", input);
        System.out.println();
    }
}
