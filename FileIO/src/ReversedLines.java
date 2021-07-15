import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        System.out.println(reversLines("src/reversed.txt"));

    }
    public static String reversLines(String cesta) {
        Path filePath = Paths.get(cesta);
        StringBuilder result = new StringBuilder();
        int index = 1;
        try {
            List<String> fileLines = Files.readAllLines(filePath);
            for (int i = 0; i < fileLines.size(); i++) {
                String lines = fileLines.get(i);

                for (int j = lines.length() -1; j >= 0; j--) {
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
