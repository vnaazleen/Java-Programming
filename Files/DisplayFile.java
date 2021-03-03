import java.io.*;

public class DisplayFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fi;
        try {
            fi = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: DisplayFile File");
            return;
        }

        int i;
        do {
            i = fi.read();
            if (i != -1) {
                System.out.print((char)i);
            }
        } while( i != -1);

        fi.close();
    }
}
