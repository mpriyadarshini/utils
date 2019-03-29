import java.io.*;
import java.nio.file.*;

public class Head {
    private static void printLines(String file){
        try{
        BufferedReader br = new BufferedReader(new FileReader(file));

        for(int i=0;i<10;i++){
            String line = br.readLine();
            if(line==null){
                break;
            }
            System.out.println(line);
        }
    }catch(IOException e){
        System.err.println(e.getMessage());
    }
    

    }

    public static void main(String args[]){
        if(args.length == 1) {
            printLines(args[0]);
            return;
        }


        for(String file:args){
            
                Path path = Paths.get(file);
                System.out.printf("==> %s <==\n", path.getFileName());
                printLines(file);
            
        }
    }
}