 


/**
 * String Assignments - Part3 : Problem Solving with Strings.
 * 
 * @author Vaseem naazleen Shaik
 * @version Java 8 29-08-2020
 */
public class Part3 {
    public boolean twoOccurrences (String stringa, String stringb) {
        int firstIndex = stringb.indexOf(stringa);
        if (firstIndex == -1) {
            return false;
        }
        
        int secondIndex = stringb.indexOf(stringa, firstIndex + 1);
        if (secondIndex == -1) {
            return false;
        }
        
        return true;
    }
    
    public void testTwoOccurrences () {
        System.out.println(twoOccurrences("atg", "ctgtatgta"));
        System.out.println(twoOccurrences("by", "A story by Abby Long"));
    }
    
    public String lastPart(String stringb, String stringa) {
        int strLena = stringb.length();
        int startIndex = stringa.indexOf(stringb);
        if (startIndex == -1) {
            return stringa;
        }
        return stringa.substring(startIndex + strLena);
    }
    
    public void testLastPart () {
        System.out.println(lastPart("an", "banana"));
        System.out.println(lastPart("zoo", "forset"));
    }
    
    public static void main(String[] args) {
        Part3 p3 = new Part3();
        p3.testTwoOccurrences();
        p3.testLastPart();
    }
}
