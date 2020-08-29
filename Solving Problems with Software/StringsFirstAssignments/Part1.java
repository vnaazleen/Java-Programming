
/**
 * Working with strings - Finding a Gene
 * 
 * @author Vaseem Naazleen Shaik
 */
public class Part1 {
    public String findSimpleGene (String dna) {
        String startCodon = "ATG";
        String stopCodon = "TAA";
        
        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1) {
            return "";
        }
        
        int stopIndex = dna.indexOf(stopCodon, startIndex + 3);
        if (stopIndex == -1) {
            return "";
        }
       
        if ((stopIndex - startIndex) % 3 != 0) {
            return "";
        }
        
        String Gene = dna.substring(startIndex, stopIndex + 3);
        return Gene;
    }
    
    public void testSimpleGene () {
        System.out.println(findSimpleGene("AATGATCCCGTAATATGGT"));
        System.out.println(findSimpleGene("CGATGGTTTG"));
        System.out.println(findSimpleGene("ATCCTATGCTTCGGCTGCTCTAATATGGT"));
        System.out.println(findSimpleGene("TTATTAA"));
    }
    public static void main(String[] args) {
        Part1 p1 = new Part1();
        p1.testSimpleGene();
    }
}
