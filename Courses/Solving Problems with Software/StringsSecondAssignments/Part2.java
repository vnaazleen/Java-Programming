
/**
 * String Second Assignments - Part 2 - Find Multiple Ocuurences
 * 
 * @author Vaseem Naazleen Shaik
 * 
 */
public class Part2 {
    public int howMany(String stringa, String stringb) {
        int startIndex = 0;
        if (startIndex == -1) {
            return 0;
        }
        int count = 0;
        while (stringb.indexOf(stringa, startIndex) != -1) {
            count += 1;
            startIndex = stringb.indexOf(stringa, startIndex) + stringa.length();
        }
        
        return count;
    }
    
    public void testHowMany () {
        System.out.println(howMany("GAA", "ATGAACGAATTGAATC"));
        System.out.println(howMany("AA", "ATAAAA"));
    }
    
    public static void main (String[] args) {
        Part2 p2 = new Part2();
        p2.testHowMany();
    }
}
