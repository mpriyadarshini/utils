import java.io.*;
import java.nio.file.*;



public class Delete { 
    public static void main(String[] args) {
        Path path = Paths.get(args[0]);
       try{
           Files.delete(path);
       } catch(IOException e){
           System.err.println(e.getMessage());
       }
    }
}