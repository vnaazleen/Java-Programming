
public class CaesarCipherTwo {
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String shiftedAlphabet1;
    private String shiftedAlphabet2;
    private int key1;
    private int key2;
    
    public CaesarCipherTwo (int key1, int key2) {
        shiftedAlphabet1 = alphabet.substring(key1) + alphabet.substring(0, key1);
        shiftedAlphabet2 = alphabet.substring(key2) + alphabet.substring(0, key2);
    }
    
    public String encrypt (String input) {
        String encrypted = "";
        
        for (int i = 0; i < input.length(); ++i) {
            if (i % 2 == 0) {
                encrypted += shiftedAlphabet1.charAt(i);
            } else {
                encrypted += shiftedAlphabet2.charAt(i);
            }
        }
        return encrypted;
    }
    
    public String decrypt (String input) {
        String decrypted = "";
        
        for (int i = 0; i < input.length(); ++i) {
            if (i % 2 == 0) {
                decrypted += shiftedAlphabet1.charAt((i - key1) >= 0 ? (i - key1) : (26 - i - key1)) ;
            } else {
                decrypted += shiftedAlphabet2.charAt((i - key2) >= 0 ? (i - key2) : (26 - i - key2));
            }
        }
        return decrypted;
    }
}
