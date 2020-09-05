
/**
 * Write a description of CaesarBreaker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.FileResource;
public class CaesarBreaker {
    public int[] countLetters (String message) {
        String alphas = "abcdefghijklmnopqrstuvwxyz";
        int[] counts = new int[26];
        for (int i = 0; i < message.length(); i++) {
            int index = alphas.indexOf(Character.toLowerCase(message.charAt(i)));
            if (index != -1) {
                counts[index]++;
            }
        }
        return counts;
    }
    
    public int indexOfMax (int[] values) {
        int maxIndex = 0;
        int i = 0;
        for (int value : values) {
            if (values[maxIndex] < value) {
                maxIndex = i;
            }
            i++;
        }
        return maxIndex;
    }
    
    public StringBuilder decrypt(String encrypted) {
        CaesarCipher cc = new CaesarCipher();
        int[] freqs = countLetters(encrypted);
        int maxIndex = indexOfMax(freqs);
        int dkey = maxIndex - 4;  // Assuming 'e' has largest frequency
        if (maxIndex < 4) {
            dkey = 26 - (4 - dkey);   // Rap around
        }
        return cc.encrypt(encrypted, 26 - dkey);
    }
    
    public String halfOfString (String message, int start) {
        String halfOfMessage = "";
        for (int i = start; i < message.length(); i += 2) {
            halfOfMessage += message.charAt(i);
        }
        return halfOfMessage;
    }
    
    public int getKey (String s) {
        int[] freqs = countLetters(s);
        int maxIndex = indexOfMax(freqs);
        int dkey = maxIndex - 4;  // Assuming 'e' has largest frequency
        if (maxIndex < 4) {
            dkey = 26 - (4 - dkey);   // Rap around
        }
        return dkey;
    }
    
    public String decryptTwoKeys (String encrypted) {
        CaesarCipher cc = new CaesarCipher();
        String encrypted1 = halfOfString(encrypted, 0);
        String encrypted2 = halfOfString(encrypted, 1);
       
        int dkey1 = getKey(encrypted1);
        int dkey2 = getKey(encrypted2);
        System.out.println(dkey1 + " " + dkey2);
        StringBuilder decrypted1 = cc.encrypt(encrypted1, 26 - dkey1);
        StringBuilder decrypted2 = cc.encrypt(encrypted2, 26 - dkey2);
        
        String decrypted = "";
        int j = 0, k = 0;
        for (int i = 0; i < encrypted.length(); ++i) {
            if (i % 2 == 0) {
                decrypted += decrypted1.charAt(j);
                j++;
            } else {
                decrypted += decrypted2.charAt(k);
                k++;
            }
        }
        return decrypted;
    }
    
}
