import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class p38 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
        
        Path filePath = Paths.get("example.txt"); // Change this to your file path

        try {
            long characterCount = Files.lines(filePath)
                                        .mapToLong(String::length)
                                        .sum();
            System.out.println("Total number of characters in the file: " + characterCount);
        } catch (IOException e) {
            System.err.println("Error occurred while reading the file: " + e.getMessage());
        }
    }
}