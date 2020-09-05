
/**
 * Strings Third Assignments - Part 2
 * 
 * @author Vaseem Naazleen Shaik 
 * @version Java 8, 30 - 08 - 2020
 */
public class Part2 {
    public float cdRatio(String dna) {
        int cgCounts = 0;
        for (char c : dna.toLowerCase().toCharArray()) {
            if (c == 'c' || c == 'g') {
                cgCounts += 1;
            }
        }
        return (float) cgCounts / dna.length();
    }
    
    public void testCGRatio() {
        System.out.println(cdRatio("ATGCCATAG"));
        // 0.44444445
    }
    
    public static void main (String args[]) {
        Part2 p2 = new Part2();
        p2.testCGRatio();
       }
}
