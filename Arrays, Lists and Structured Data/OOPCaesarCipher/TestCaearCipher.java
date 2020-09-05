
import edu.duke.FileResource;

public class TestCaearCipher {
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
    
    public String breakCaesarCipher (String encrypted) {
        int[] freqs = countLetters(encrypted);
        int maxIndex = indexOfMax(freqs);
        int dkey = maxIndex - 4;  // Assuming 'e' has largest frequency
        if (maxIndex < 4) {
            dkey = 26 - (4 - dkey);   // Rap around
        }
        CaesarCipher cc = new CaesarCipher(26- dkey);
        return cc.encrypt(encrypted);
    }
    
    public void simpleTests () {
        FileResource fr = new FileResource();
        String message = fr.toString().toLowerCase();
        CaesarCipher cc = new CaesarCipher(18);
        
        System.out.println("Encrypted text:");
        String encrypted = cc.encrypt(message);
        System.out.println(encrypted);
        
        System.out.println("Decrypted text:");
        System.out.println(cc.decrypt(encrypted));
        
        System.out.println("Auto Decrypted text:");
        System.out.println(breakCaesarCipher(encrypted));
    }
}
