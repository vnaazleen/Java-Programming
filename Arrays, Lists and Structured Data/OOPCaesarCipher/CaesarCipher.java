
public class CaesarCipher {
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String shiftedAlphabet;
    private int mainKey;
    
    // constructor
    public CaesarCipher (int key) {
        mainKey = key;
        shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
    }
    
    public String encrypt (String input) {
        String encrypted = "";
        for (char c : input.toCharArray()) {
            encrypted += shiftedAlphabet.charAt(alphabet.indexOf(c));
        }
        return encrypted;
    }
    
    public String decrypt (String input) {
        String decrypted = "";
        for (char c : input.toCharArray()) {
            decrypted += alphabet.charAt(26 - shiftedAlphabet.indexOf(c));
        }
        return decrypted;
    }
    
}
