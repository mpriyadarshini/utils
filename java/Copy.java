import java.io.*;

public class Copy {
    public static void main(String[] args) {
        String source = args[0];
        String des = args[1];

        try (FileInputStream fin = new FileInputStream(source); FileOutputStream fout = new FileOutputStream(des)) {
            for (int b = fin.read(); b != -1; b = fin.read()) {
                fout.write(b);
            }
            fin.close();
            fout.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}