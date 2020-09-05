
/**
 * String Second Assignments - Part 3 - How Many Genes?
 * 
 * @author Vaseem Naazleen Shaik
 * 
 */
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
    
    public int countGenes (String dna) {
        int startIndex = 0;
        int count = 0;
        while (true) {
            String gene = findGene(dna, startIndex);
            if (gene.isEmpty())
            {
                break;
            }
            count += 1;
            
            startIndex = gene.length() + dna.indexOf(gene, startIndex);
        }
        return count;
    }
    
    public void testCountGenes () {
        System.out.println(countGenes("ATGTAAGATGCCCTAGT"));
    }
    
    public static void main (String[] args) {
        Part3 p3 = new Part3();
        p3.testCountGenes();
    }
}
