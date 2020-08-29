import edu.duke.*;

/**
 * String Assignments - Part 4 : Finding Web links
 * 
 * @author Vaseem Naazleen Shaik
 * @version Java 8, 29 - 08 - 2020
 */
public class Part4 {
    public void findWebLinks(String url) {
        URLResource ur = new URLResource(url);
        
        for (String word : ur.words()) {
            String lowerWord = word.toLowerCase();
            boolean foundYouTube = word.indexOf("youtube") > 0;
            if (!foundYouTube) {
                continue;
            }
            
            // Find youtube is present then find the url in word
            int startIndex = word.indexOf("\"");
            int endIndex = word.indexOf("\"", startIndex + 1);
            System.out.println(word.substring(startIndex + 1, endIndex));
        }
    }
    
    public static void main(String[] args) {
        Part4 p4 = new Part4();
        p4.findWebLinks("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
    }
}
