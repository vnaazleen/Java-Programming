
/**
 * Strings Third Assignments - Part 1 - Storing All Genes
 * 
 * @author Vaseem Naazleen Shaik
 *
 */

import edu.duke.StorageResource;
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
    
    public StorageResource getAllGenes (String dna) {
        int startIndex = 0;
        StorageResource allGenes = new StorageResource();
        while (true) {
            String gene = findGene(dna, startIndex);
            if (gene.isEmpty())
            {
                break;
            }
            allGenes.add(gene);
            
            startIndex = gene.length() + dna.indexOf(gene, startIndex);
        }
        return allGenes;
    }
    
    public static void main (String[] args) {
        Part1 p1 = new Part1();
        StorageResource allGenes = p1.getAllGenes("ATGATCTAATTTATGCTGCAACGGTGAAGA");
        for (String gene : allGenes.data()) {
            System.out.println(gene);
        }
        /*
         * ATGATCTAA
         * ATGCTGCAACGGTGA
         */
    }
}
