import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.

public class WriteMultipleLines {
    public static void main(String[] args) {
        writeLines("src/fruits.txt","pear", 10);
    }

    public static void writeLines(String cesta, String word, int count ){
        List<String> content = new ArrayList();


        for (int i = 0; i < count; i++) {
            content.add(word);
        }

        try { // Required by Files.write(filePath, content)
            // Creates a new file if not exists and overwrites it's content
            // The elements of the content lists will become the lines of the file
            Path filePath = Paths.get(cesta);
            Files.write(filePath, content);
        } catch (Exception e) {
            System.err.println("Uh-oh, could not write the file!");
        }

    }
}
