
/**
 * Caesar Chipher
 * 
 * @author Shaik Vaseem Naazleen
 * @version Java 8
 */
import java.lang.Character;
public class CaesarCipher {
    public StringBuilder encrypt (String input, int key) {
        String alphas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encrypts = alphas.substring(key) + alphas.substring(0, key);
        StringBuilder encrypted = new StringBuilder(input);
        for (int i = 0; i < encrypted.length(); ++i) {
            int indx = alphas.indexOf(Character.toUpperCase(input.charAt(i)));
            if (indx != -1) {
                if (Character.isLowerCase(encrypted.charAt(i)))
                    encrypted.setCharAt(i, Character.toLowerCase(encrypts.charAt(indx)));
                else
                    encrypted.setCharAt(i, encrypts.charAt(indx));  
            } 
        }
        return encrypted;
    }
    
    public String encryptTwoKeys (String input, int key1, int key2) {
        StringBuilder encrypted1 = encrypt(input, key1);
        StringBuilder encrypted2 = encrypt(input, key2);
        String encrypted = "";
        
        for (int i = 0; i < input.length(); ++i) {
            if (i % 2 == 0) {
                encrypted += encrypted1.charAt(i);
            } else {
                encrypted += encrypted2.charAt(i);
            }
        }
        return encrypted;
    }
    
    
    public void tester () {
        //System.out.println(("First Legion", 23, 17));
        //System.out.println(encryptTwoKeys("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 8, 21));
        System.out.println(encryptTwoKeys("Hfs cpwewloj loks cd Hoto kyg Cyy.", 14, 24));

    }
}
