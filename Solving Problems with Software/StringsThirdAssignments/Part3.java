
/**
 * Strings Third Assignments - Part 2
 * 
 * @author Vaseem Naazleen Shaik 
 * @version Java 8, 30 - 08 - 2020
 */

import edu.duke.StorageResource;
import edu.duke.FileResource;

public class Part3 {
    
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
    
    public float cdRatio(String dna) {
        int cgCounts = 0;
        for (char c : dna.toLowerCase().toCharArray()) {
            if (c == 'c' || c == 'g') {
                cgCounts += 1;
            }
        }
        return (float) cgCounts / dna.length();
    }
    
    public void processGenes (StorageResource sr) {
        int StrsLenGreaterthan9 = 0;
        int StrscdRatioGreaterthan35 = 0;
        int longestGeneSize = 0;
        int sLen;
        boolean found;
        for (String s : sr.data()) {
            found = false;
            sLen = s.length();
            if (sLen > 9)
            {
                StrsLenGreaterthan9 += 1;
                found = true;
            }
            if (cdRatio(s) > 0.35) 
            {
               StrscdRatioGreaterthan35 += 1;
               found = true;
            }
            
            if (found) {
                System.out.println(s);
            }
            
            if (sLen > longestGeneSize)
            {
                longestGeneSize = sLen;
            }
        }
        
        System.out.println("Size of longest Gene: " + longestGeneSize);
        System.out.println("Genes whose length greater than 9: " + StrsLenGreaterthan9);
        System.out.println("Genes whose CG ratio greater than 0.35: " + StrscdRatioGreaterthan35);
    }
    
    public void testProcessGene() {
        FileResource fr = new FileResource("brca1line.fa");
        String dna = fr.asString();
    }
}
