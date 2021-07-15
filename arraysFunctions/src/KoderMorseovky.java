
import java.util.Scanner;

public class KoderMorseovky{
    public static void main(String[] args) {

        String abecedniZnaky = "abcdefghijklmnopqrstuvwxyz";
        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
        "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
        "...-", ".--", "-..-", "-.--", "--.."};

        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("Zadejte zprávu k zakódování:");
        String input = sc.nextLine().trim().toLowerCase();


        String output = "";
        for (int i = 0; i < input.length(); i++) {
            int index = abecedniZnaky.indexOf(input.charAt(i));
                if(index >= 0){
                    output += morseovyZnaky[index] + " ";
                }
            }
        System.out.println("Zakódovaná zpráva: " + output);
        }
}