import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"

public class WriteSingleLine {
    public static void main(String[] args) {
        nameWrite("Tomas Rolny");

    }
    public static void nameWrite(String vstup){
        List<String> content = new ArrayList();
        content.add(vstup);

        try { // Required by Files.write(filePath, content)
            // Creates a new file if not exists and overwrites it's content
            // The elements of the content lists will become the lines of the file
            Path filePath = Paths.get("src/name.txt");
            Files.write(filePath, content);
        } catch (Exception e) {
            System.err.println("Uh-oh, could not write the file!");
        }

    }
}
