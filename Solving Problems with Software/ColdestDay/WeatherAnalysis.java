
/**
 * Parsing Weather data
 * 
 * @author Vaseem Naazleen Shaik
 * 
 */

import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.File;

import java.lang.*; 

public class WeatherAnalysis {
    public CSVRecord coldestHourInFile (CSVParser parser) {
        CSVRecord ColdestSoFar = null;
        for (CSVRecord record : parser) {
            if (record.get("Humidity").equals("N/A")) {
                continue;
            }
            if (ColdestSoFar == null) {
                ColdestSoFar = record;
            }
            else {
                double ColdestTempSoFar = Double.parseDouble(ColdestSoFar.get("TemperatureF"));
                double CurrTemp = Double.parseDouble(record.get("TemperatureF"));
                if (CurrTemp < ColdestTempSoFar) {
                    ColdestSoFar = record;
                }
            }
        }
        
        return ColdestSoFar;
    }
    
    public void testColdestHourInFile () {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        CSVRecord coldestHourinDay = coldestHourInFile(parser);
        System.out.println("The Coldest Hour Temperature is " + coldestHourinDay.get("TemperatureF") + " at " + coldestHourinDay.get("DateUTC"));
    }
    
    public String fileWithColdestTemperature () {
        DirectoryResource dir = new DirectoryResource();
        File ColdestFileSoFar = null;
        double ColdestHourSoFar = 1000.0;
        double CurrColdestHour;
        CSVRecord CurrRecord;
        for (File f : dir.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVParser parser = fr.getCSVParser();
            
            CurrRecord = coldestHourInFile(parser);
            CurrColdestHour = Double.parseDouble(CurrRecord.get("TemperatureF"));
            
            if (CurrColdestHour< ColdestHourSoFar) {
                ColdestHourSoFar = CurrColdestHour;
                ColdestFileSoFar = f;
            }
        
        }
        String ColdestFileName = ColdestFileSoFar.getName();
        
        System.out.println("Coldest day was in the file " + ColdestFileName);
        System.out.println("Coldest temperature on that day was " + ColdestHourSoFar);
        System.out.println("All the Temperatures on the coldest day were:");
        FileResource cfr = new FileResource(ColdestFileSoFar);
        for (CSVRecord record : cfr.getCSVParser()) {
            System.out.println(record.get("DateUTC") + "  :  " + record.get("TemperatureF"));
        }
        return ColdestFileName;
    }
    
    public void testFileWithColdestTemperature() {
        fileWithColdestTemperature();
    }
    
    
    public CSVRecord lowestHumidityInFile(CSVParser parser) {
        int lowestHumidity = 10000;
        int currentHumidity;
        CSVRecord lowestHumidityRecord = null;
        for (CSVRecord record : parser) {
            
            if (record.get("Humidity").equals("N/A")) {
                continue;
            }
            currentHumidity = Integer.parseInt(record.get("Humidity"));
            if (lowestHumidity > currentHumidity) {
                lowestHumidity = currentHumidity;
                lowestHumidityRecord = record;
            }
        }
        return lowestHumidityRecord;
    }
    
    public void testLowestHumidityInFile () {
       FileResource fr = new FileResource();
       CSVParser parser = fr.getCSVParser();
       CSVRecord csv = lowestHumidityInFile(parser);
       System.out.println("Lowest Humidity was " + csv.get("Humidity") + " at " + csv.get("DateUTC"));
    }
    
    public CSVRecord lowestHumidityInManyFiles () {
        CSVRecord lowestHumidityRecord = null;
        CSVRecord currRecord;
        int currHumidity;
        int LowestHumidity = 10000;
        DirectoryResource dir = new DirectoryResource();
        
        for (File f : dir.selectedFiles()) {
            FileResource fr = new FileResource(f);
            CSVParser parser = fr.getCSVParser();
            currRecord = lowestHumidityInFile(parser);
            currHumidity = Integer.parseInt(currRecord.get("Humidity"));
            if (LowestHumidity > currHumidity) {
                LowestHumidity = currHumidity;
                lowestHumidityRecord = currRecord;
            }
        }
        return lowestHumidityRecord;
    }
    
    public void testLowestHumidityInManyFiles () {
        CSVRecord record = lowestHumidityInManyFiles();
        System.out.println("Lowest Humidity was " + record.get("Humidity") + " at " + record.get("DateUTC"));
    }
    
    public double averageTemperatureInFile (CSVParser parser) {
        double sumOfTemps = 0;
        int numOfTemps = 0;
        for (CSVRecord record : parser) {
            numOfTemps += 1;
            sumOfTemps += Double.parseDouble(record.get("TemperatureF"));
        }
        return sumOfTemps / numOfTemps;
    }
    
    public void testAverageTemperatureInFiles () {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        System.out.println("Average temperature in file is " + averageTemperatureInFile(parser));
    }
    
    public double averageTemperatureWithHighHumidityInFile (CSVParser parser, int value) {
        double sumOfTemps = 0;
        int numOfTemps = 0;
        for (CSVRecord record : parser) {
            if (record.get("Humidity").equals("N/A")) continue;
            if (Integer.parseInt(record.get("Humidity")) >= value) {
                numOfTemps += 1;
                sumOfTemps += Double.parseDouble(record.get("TemperatureF"));
            }
        }
        return sumOfTemps / numOfTemps;
    }
    
    public void testAverageTemperatureWithHighHumidityInFile () {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        Double avgTemp = new Double(averageTemperatureWithHighHumidityInFile(parser, 80));
        if (avgTemp.isNaN()) {
            System.out.println("No temperatures with that humidity");
        } 
        else {
            System.out.println("Average temperature when high Humidity is " + avgTemp);
        }
    }
}
