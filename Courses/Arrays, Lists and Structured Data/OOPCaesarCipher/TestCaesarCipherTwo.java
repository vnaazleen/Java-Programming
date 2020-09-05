import edu.duke.FileResource;

public class TestCaesarCipherTwo {
    public String halfOfString (String message, int start) {
        String halfOfMessage = "";
        for (int i = start; i < message.length(); i += 2) {
            halfOfMessage += message.charAt(i);
        }
        return halfOfMessage;
    }
    
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
    
    public int getKey (String s) {
        int[] freqs = countLetters(s);
        int maxIndex = indexOfMax(freqs);
        int dkey = maxIndex - 4;  // Assuming 'e' has largest frequency
        if (maxIndex < 4) {
            dkey = 26 - (4 - dkey);   // Rap around
        }
        return dkey;
    }
    
    public String breakCaesarCipher (String encrypted) {
        String encrypted1 = halfOfString(encrypted, 0);
        String encrypted2 = halfOfString(encrypted, 1);
       
        int dkey1 = getKey(encrypted1);
        int dkey2 = getKey(encrypted2);

        CaesarCipherTwo cct = new CaesarCipherTwo(dkey1, dkey2);
        String decrypted1 = cct.encrypt(encrypted1);
        String decrypted2 = cct.encrypt(encrypted2);
        
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
    
    public void simpleTests () {
        FileResource fr = new FileResource();
        String message = fr.toString().toLowerCase();
        CaesarCipherTwo cct = new CaesarCipherTwo(17, 3);
        
        System.out.println("Encrypted text:");
        String encrypted = cct.encrypt(message);
        System.out.println(encrypted);
        
        System.out.println("Decrypted text:");
        System.out.println(cct.decrypt(encrypted));
        
        System.out.println("Auto Decrypted text:");
        System.out.println(breakCaesarCipher(encrypted));
    }
}
