import java.io.*;
import java.nio.file.*;

public class Delete {
    public static void main(String[] args) {

        for (String p : args) {
            Path path = Paths.get(p);
            try {
                Files.delete(path);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}