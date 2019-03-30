import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DD {
    public static void main(String[] args) {
        int blockSize = Integer.parseInt(args[0]);
        int count = Integer.parseInt(args[1]);

        try (FileInputStream fin = new FileInputStream(args[2]);
                FileOutputStream fout = new FileOutputStream(args[3])) {
            int byteReads = 0;
            byte[] block = new byte[blockSize];
            for (int i = 0; i < count; i++) {
                int red = fin.read(block);
                if (red == -1) {
                    break;
                }
                fout.write(block, 0, red);
                byteReads += red;
            }
            System.out.println("Bytes read:" + byteReads);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}