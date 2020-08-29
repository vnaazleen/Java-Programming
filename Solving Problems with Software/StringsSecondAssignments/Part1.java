
/**
 * Strings Second Assignments - Part 1 - Finding many Genes
 * 
 * @author Vaseem Naazleen Shaik
 *
 */
public class Part1 {
    public int findStopCodon (String dna, int startIndex, String stopCodon) {
        int stopIndex = dna.indexOf(stopCodon, startIndex + 1);
        if (stopIndex == -1) {
            return dna.length();
        }
        
        if ((stopIndex - startIndex) % 3 == 0)
        {
            return stopIndex;
        }
        
        return dna.length();
    }
    
    public String findGene (String dna, int where) {
        int startIndex = dna.indexOf("ATG", where);
        if (startIndex == -1) {
            return "";
        }
        
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG"); 
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        
        int closestStopIndex = Math.min(taaIndex, Math.min(tagIndex, tgaIndex));
        if (closestStopIndex == dna.length())
        {
            return "";
        }
        
        return dna.substring(startIndex, closestStopIndex + 3);
    }
    
    public void printAllGenes (String dna) {
        int startIndex = 0;
        while (true) {
            String gene = findGene(dna, startIndex);
            if (gene.isEmpty())
            {
                break;
            }
            System.out.println(gene);
            
            startIndex = gene.length() + dna.indexOf(gene, startIndex);
        }
    }
    
    public static void main (String[] args) {
        Part1 p1 = new Part1();
        p1.printAllGenes("ATGATCTAATTTATGCTGCAACGGTGAAGA");
        /*
         * ATGATCTAA
         * ATGCTGCAACGGTGA
         */
    }
}
