import java.io.*;
import java.net.*;

public class Download {
    private static void streamCopy(InputStream istream, OutputStream ostream) throws IOException {
        int b;
        while ((b = istream.read()) != -1) {
            ostream.write(b);
        }

    }

    public static void main(String args[]) {
        try {
            URL url = new URL(args[0]);
            String outputFile = args[1];

            try (InputStream istream = url.openStream(); FileOutputStream fout = new FileOutputStream(outputFile);) {
                System.out.println("file downloading");
                streamCopy(istream, fout);
                System.out.println("file downloaded");
            }

            catch (IOException e) {
                System.err.println(e.getMessage());
            }
        } catch (MalformedURLException e) {
            System.err.println(e.getMessage());
        }
    }
}