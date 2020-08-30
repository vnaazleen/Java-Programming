
/**
 * ParsingExportData - CSV file
 * 
 * @author Shaik Vaseem Naazleen
 * @version 30 - 08 - 2020
 */
import edu.duke.*;
import org.apache.commons.csv.*;

public class ParsingExportData {
    public String countryInfo (CSVParser parser, String country)
    {
        for (CSVRecord record : parser) {
            String currCountry = record.get("Country");
            
            if (currCountry.equals(country)) {
                return country + ": " +  record.get("Exports") + " chemicals: " + record.get("Value (dollars)");
            }
        }
        
        return "NOT FOUND";
    }
    
    public void listExportersTwoProducts (CSVParser parser, String exportItem1, String exportItem2) {
        for (CSVRecord record : parser) {
            String export = record.get("Exports");
            
            if (export.contains(exportItem1) && export.contains(exportItem2)) {
                System.out.println(record.get("Country"));
            }
        }
    }
    
    public int numberOfExporters (CSVParser parser, String exportItem) {
        int CountExporters = 0;
        for (CSVRecord record : parser) {
            String export = record.get("Exports");
            
            if (export.contains(exportItem)) {
                CountExporters += 1;
            }
        }
        return CountExporters;
    }
    
    public void bigExporters (CSVParser parser, String amount) {
        int lenAmount = amount.length();
        for (CSVRecord record : parser) {
            String amt = record.get("Value (dollars)");
            
            if (lenAmount < amt.length()) {
                System.out.println(record.get("Country") + " " + amt);
            }
        }
    }
    
    public void tester () {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        // Uncomment to test methods
        //System.out.println(countryInfo(parser, "Nauru"));
        //listExportersTwoProducts(parser, "fish", "nuts"); 
        //System.out.println(numberOfExporters(parser, "sugar"));
        //bigExporters(parser, "$999,999,999,999");
    }
}
