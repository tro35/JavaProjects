import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        System.out.println(reversOrder("src/reversed-order.txt"));

    }

    public static String reversOrder(String cesta) {
        Path filePath = Paths.get(cesta);
        StringBuilder result = new StringBuilder();
        try {
            List<String> fileLines = Files.readAllLines(filePath);
            for (int i = fileLines.size() - 1; i >= 0; i--) {
                String lines = fileLines.get(i);
                result.append(lines + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}



