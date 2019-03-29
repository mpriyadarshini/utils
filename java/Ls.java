import java.io.*;

class Ls{

    private static void listDirectory(File dir)throws IOException{
        File[] files = dir.listFiles();

        for(File file:files){
            System.out.println(file.getName());
        }
    }
    public static void main(String args[]){
        if(args.length <= 1){
            try{
                String dir = ".";
                if(args.length == 1){
                    dir = args[0];
                }
                listDirectory(new File(dir));
                return;
            }
            catch(IOException e){
                System.err.println(e.getMessage());
                System.exit(1);
            }
        }
        for(String dirPath:args){
            File dir = new File(dirPath);
            try{
                System.out.printf ("%s:\n", dir.getAbsoluteFile().toPath().normalize());
                listDirectory(dir);
            }
            catch(Exception e){
                System.err.printf("%s:%s",dir.getName(),e.getMessage());
            }
        }
    }
}