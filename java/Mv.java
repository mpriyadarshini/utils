import java.io.*;

import java.nio.file.*;

public class Mv{
    public static void main(String args[]){
        Path src = Paths.get(args[0]);
        Path dest = Paths.get(args[1]);

        try{
            Files.move(src,dest);
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}