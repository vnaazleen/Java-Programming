
/**
 * Implementing Caesar Cipher - Word Play
 * 
 * @author Shaik Vaseem Naazleen
 * @version Java 8
 */
import java.lang.*;

public class WordPlay {
    public boolean isVowel (char ch) {
        if ("aeiou".indexOf(Character.toLowerCase(ch)) != -1) {
            return true;
        }
        return false;
    }
    
    public String replace (String phrase, char ch) {
        String replacedPhrase = "";
        
        for (char c: phrase.toCharArray()) {
            if (isVowel(c)) {
                replacedPhrase += ch;
            } else {
                replacedPhrase += c;
            }
        }
        return replacedPhrase;
    }
    
    public String emphasize (String phrase, char ch) {
        String emphasizedPhrase = "";
        int i = 0;
        for (char c: phrase.toCharArray()) {
            if (c == ch) {
                if (i % 2 == 0) {
                    emphasizedPhrase += '*';
                } else {
                    emphasizedPhrase += '+';
                }
            } else {
                emphasizedPhrase += c;
            }
            i++;
        }
        return emphasizedPhrase;
    }
    
    public void tester () {
        System.out.println(emphasize("dna ctgaaactga", 'a'));
    }
}
