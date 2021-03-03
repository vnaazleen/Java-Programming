
/**
 * Copy a text file
 * To use this program , specify a source file and a destination file.
 * For example lets say Source file: file1.txt and destination file: file2.txt
 * java CopyFile file1.txt file2.txt (Command line)
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fi;
        FileOutputStream fo;

        try {
            // open input file
            try {
                fi = new FileInputStream(args[0]);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Usage: CopyFile sourceFile destFile");
                return;
            }

            // open output file 
            try {
                fo = new FileOutputStream(args[1]);
            } catch (FileNotFoundException e) {
                System.out.println("Error in opening output file");
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Usage: CopyFile sourceFile destFile");
                return;
            }

            // copy the file
            try {
                do {
                    i = fi.read();
                    if (i != -1) {
                        fo.write(i);
                    }
                } while( i != -1);

            fi.close();
            fo.close();

            } catch(IOException e) {
                System.out.println("File Error");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}

