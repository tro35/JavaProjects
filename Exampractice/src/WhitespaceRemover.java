import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WhitespaceRemover {
    public static void main(String[] args) throws Exception {
        whiteSpaceRemover("src\\input.txt");
    }

    public static void whiteSpaceRemover(String cesta) throws Exception {
        Path filePath = Paths.get(cesta);
        StringBuilder result = new StringBuilder();
        List<String> fileLines = new ArrayList<String>();
        try {
            fileLines = Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new Exception("File does not exist");
        }
        for (int i = 0; i < fileLines.size(); i++) {
            String lines = fileLines.get(i);
            lines = lines.replaceAll("\\s+", " ");
            result.append(lines + '\n');
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src\\output.txt"));
            writer.write(result.toString());
            writer.close();
        } catch (IOException e) {
            throw new Exception("Unable write to file");
        }
    }

}

