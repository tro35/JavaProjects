import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

public class CountLines {
    public static void main(String[] args) {

        System.out.println(readFile("src/test.txt"));
    }

    public static long readFile(String file) {
        Path filePath = Paths.get(file);
        long count = 0;
        try {
            count = Files.lines(filePath).count();

        } catch (Exception e) {
            System.err.println("File doesnt exist!");
        }
        return count;
    }
}


