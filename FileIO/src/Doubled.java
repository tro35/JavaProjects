import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

// Create a method that decrypts the duplicated-chars.txt

public class Doubled {
    public static void main(String[] args) {
        
        System.out.println(removeDuplicate("src/doubled.txt"));

    }

    public static String removeDuplicate(String cesta) {
        Path filePath = Paths.get(cesta);
        StringBuilder result = new StringBuilder();
        try {
            List<String> fileLines = Files.readAllLines(filePath);
            for (int i = 0; i < fileLines.size(); i++) {
                String lines = fileLines.get(i);

                for (int j = 0; j < lines.length(); j = j + 2) {
                    result.append(lines.charAt(j));
                }
                result.append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}









