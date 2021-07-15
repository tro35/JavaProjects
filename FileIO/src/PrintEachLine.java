import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

// Write a program that opens a file called "my-file.txt", then prints
// each line from the file.
// If the program is unable to read the file (for example it does not exist),
// then it should print the following error message: "Unable to read file: my-file.txt"


public class PrintEachLine {
    public static void main(String[] args) {
        String cesta = "src/test.txt";

        try { // Required by Files.readAllLines(filePath);
            // Reads the content from `lorem-ipsum.txt` in the `assets` folder line by line to a String List
            Path filePath = Paths.get(cesta);
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines);
        } catch (Exception e) {
            System.out.println("Unable to read file: test.txt");
        }

    }
}
