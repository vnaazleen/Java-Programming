// Experiment 17
 
import java.io.File;
import java.util.Scanner;
 
 
public class Experiment17 {
    public static void displayInfo(File f) {
 
        // checking whether file exists or not
        System.out.println(f.exists() ? f.getName()  + " exists" : f.getName() + " doesn't exist");
 
        // checking whether file is readable or not
        System.out.println(f.canRead() ? f.getName() + " is readable" : f.getName() + " is not readable");
 
        // whether file is writable or not
        System.out.println(f.canWrite() ? f.getName() + " is writable" : f.getName() + " is not writable");
 
        // type of file
        System.out.println(f.isFile() ? f.getName() + " is normal file" : f.getName() + " is pipe");
 
        // length of file in bytes
        System.out.println("Length of " + f.getName() + " file is " + f.length() + " bytes");
 
    }
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the file name: ");
        String fileName = input.next();
 
        File fObj = new File(fileName);
 
        displayInfo(fObj);
    }
 
    /**
    Output:
    
    Enter the file name: hello.txt
    hello.txt exists
    hello.txt is readable
    hello.txt is writable
    hello.txt is normal file
    Length of hello.txt file is 58 bytes
 
 */
}
