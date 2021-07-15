import java.util.Scanner;
public class VigenerCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Zadejte text k zašifrování: ");
        String input = sc.nextLine().trim().toLowerCase();
        System.out.println("Zadejte heslo: ");
        String key = sc.nextLine().trim().toLowerCase();

        //pomocne promenne
        String cipherText = "";
        int placeA = (int) 'a';
        int placeZ = (int) 'z';

        for (int i = 0; i < input.length(); i++) {
            int x = (int) key.charAt(i % key.length()) - (placeA - 1);

            if((int)input.charAt(i) + x > placeZ){
                x -= placeZ - placeA + 1;
            }
            char letter = (char)((int) input.charAt(i) + x);
            cipherText += letter;
        }


        System.out.println(cipherText);
    }
}
