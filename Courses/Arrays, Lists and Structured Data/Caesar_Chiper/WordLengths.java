
/**
 * Counting the frequencies of words and finding the most common word length
 * 
 * @author Vaseem Naazleen Shaik
 * @version java 8
 */

import edu.duke.FileResource;
public class WordLengths {
    public void countWordLengths (FileResource resource, int[] counts) {
        int wordLength;
        for (String word : resource.words()) {
            wordLength = word.length();
            if (wordLength == 0)
                continue;
            if (!Character.isLetter(word.charAt(0))) {
                wordLength--;
            }
            if (wordLength == 0)
                continue;
            if (!Character.isLetter(word.charAt(word.length() - 1))) {
                wordLength--;
            }
            counts[wordLength]++;
        }
    }
    
    public int indexOfMax (int[] values) {
        int maxIndex = 0;
        int i = 0;
        for (int value : values) {
            if (values[maxIndex] < value) {
                maxIndex = i;
            }
            i++;
        }
        return maxIndex;
    }
    
    public void testCountWordLengths () {
        FileResource fr = new FileResource();
        int[] counts = new int[31];
        countWordLengths(fr, counts);
        int i = 0;
        for (int count: counts) {
            System.out.println("Length: " + i + "  Num of words: " + count);
            i++;
        }
        System.out.println("Most common word length in file: " + indexOfMax(counts) + 1);
    }
}

