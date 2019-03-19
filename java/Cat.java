import java.io.*;

public class Cat{
    public static void main(String args[]) throws Exception{
        try{
        for(String file:args){
        FileReader f = new FileReader(file);
        int i;
        while((i=f.read()) !=-1)


            System.out.print((char) i);
        }
    
    }
    catch(IOException e){
        e.printStackTrace();
    }
    }
}