import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

public class WordCharLineCount
{
    public static void main(String args[]){
        BufferedReader reader = null;
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        try
        {
            for(String file:args)
            {
            reader = new BufferedReader(new FileReader(file));
            
            String currentLine = reader.readLine();
            while((currentLine) != null){
                lineCount++;
                String[] words = currentLine.split("");
                wordCount = wordCount + words.length;
                for(String word:words){
                    charCount = charCount + word.length();
                }
                currentLine = reader.readLine();
            }
            System.out.println(lineCount+" "+wordCount+" "+charCount+" "+file);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}