
/**
 * Working with strings - Finding a Gene (Part - 2)
 * 
 * @author Vaseem Naazleen Shaik
 */
public class Part2 {
    public String findSimpleGene (String dna, String startCodon, String stopCodon) {
        // Checking the case of startCodon and stopCodon and mke sure they have same type as dna
        if (dna.equals(dna.toLowerCase())) {
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }
        else {
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        }
        
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
        System.out.println(findSimpleGene("AGATGCGATACGCTTAATC", "ATG", "TAA"));
        System.out.println(findSimpleGene("AGATGCGATACGCTAATC", "ATG", "TAA"));
        System.out.println(findSimpleGene("atgtaa", "ATG", "TAA"));
        System.out.println(findSimpleGene("ATGTAA", "ATG", "TAA"));
    }
    public static void main(String[] args) {
        Part2 p2 = new Part2();
        p2.testSimpleGene();
    }
}
