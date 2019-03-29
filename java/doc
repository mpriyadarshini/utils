import java.io.*;
import java.nio.file.*;

public class Cp {
public static void main(String[] args) {
    Path source = Paths.get(args[0]);
    Path dest = Paths.get(args[1]);

    try{
        Files.copy(source,dest);

    }
    catch(IOException e){
        System.err.println(e.getMessage());
    }
}
    
}