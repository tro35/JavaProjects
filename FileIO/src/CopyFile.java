import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

public class CopyFile {
    public static void main(String[] args) {

        if (copyContent("src/fruits.txt", "src/name.txt") == true) {
            System.out.println("Copy was sucessfull");
        } else {
            System.out.println("Copy was not  sucessfull");
        }


    }

    public static boolean copyContent(String fromFile, String toFile) {
        List<String> content = new ArrayList();
        boolean result = false;
        try {
            Path filePath = Paths.get(fromFile);
            List<String> lines = Files.readAllLines(filePath);

            content.addAll(lines);

            Path filePath1 = Paths.get(toFile);
            Files.write(filePath1, content);
            result = true;
        } catch (Exception e) {
            System.out.println("Unable to write file: " + toFile);
            result = false;
        }
        return result;
    }

}
