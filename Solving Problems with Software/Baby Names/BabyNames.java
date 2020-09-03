
/**
 * Final Mini project - Baby Names
 * 
 * @author Shaik Vaseem Naazleen
 * @version Java 8
 */

import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.File;

public class BabyNames {
    public void totalBirths () {
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser(false);
        int girlCounts = 0;
        int boyCounts = 0;
        int totalCounts = 0;
        for (CSVRecord record: parser) {
            totalCounts += 1;
            if (record.get(1).equals("M")) {
                boyCounts += 1;
            } else {
                girlCounts += 1;
            }
        }
        System.out.println("Number of baby girls: " + girlCounts);
        System.out.println("Number of baby boys: " + boyCounts);
        System.out.println("Number of babies: " + totalCounts);
    }
    
    
    public int getRank (int year, String name, String gender) {
        FileResource fr = new FileResource("us_babynames/by_year/yob" + year + ".csv");
        CSVParser parser = fr.getCSVParser(false);
        int numberOfNames = 0;
        int rank = 0;
        for (CSVRecord record : parser) {
            if ((record.get(0).equals(name)) && (record.get(1).equals(gender))) {
                numberOfNames = Integer.parseInt(record.get(2));
            }
        }

        parser = fr.getCSVParser(false);
        for (CSVRecord record : parser) {
            if (record.get(1).equals(gender)) {
                rank += 1;
                if (record.get(0).equals(name)) {
                    return rank;
                }   
            }
        }
        return -1;
    }
    
    
    public String getName (int year, int rank, String gender) {
        FileResource fr = new FileResource("us_babynames/by_year/yob" + year + ".csv");
        CSVParser parser = fr.getCSVParser(false);
        for (CSVRecord record : parser) {
            if ((getRank(year, record.get(0), gender) == rank) && (record.get(1).equals(gender))) {
                return record.get(0);
            }
        }
        return "NO NAME";
    }
    
    
    public void whatIsNameInYear (String name, int year, int newYear, String gender) {
        int rank = getRank(year, name, gender);
        String newName = getName(newYear, rank, gender);
        String proNoun = (gender.equals("M")) ? "he" : "she";
        System.out.println(name + " born in " + year + " would be " + newName + " if " + proNoun + " born in " + newYear);
    }
    
    
    public int yearOfHighestRank (String name, String gender) {
        DirectoryResource dr = new DirectoryResource();
        int Highestrank = Integer.MAX_VALUE;
        int HighestRankYear = -1;
        int rank;
        for (File f : dr.selectedFiles()){
            int year = Integer.parseInt(f.getName().substring(3, 7));
            rank = getRank(year, name, gender);
            if (rank != -1 && rank < Highestrank) {
                Highestrank = rank;
                HighestRankYear = year;
            }
        }
        return HighestRankYear;
    }
    
    public double getAvergeRank(String name, String gender) {
        DirectoryResource dr = new DirectoryResource();
        boolean notRanked = true;
        double sumRank = 0;
        int numberFiles = 0;
        double rank;
        for (File f : dr.selectedFiles()){
            int year = Integer.parseInt(f.getName().substring(3, 7));
            rank = getRank(year, name, gender);
            if (rank != -1) {
                sumRank += rank;
                numberFiles++;
                notRanked = false;
            }
        }
        if (notRanked) {
            return -1.0;
        }
        return sumRank / numberFiles;
    }
    
    public int getTotalBirthsRankedHigher (int year, String name, String gender) {
        FileResource fr = new FileResource("us_babynames/by_year/yob" + year + ".csv");
        CSVParser parser = fr.getCSVParser(false);
        int totalNumberOfBirths = 0;
        int numberOfBirths;
        for (CSVRecord record: parser) {
            if (record.get(1).equals(gender)){
                if (!(record.get(0).equals(name))) {
                    numberOfBirths = Integer.parseInt(record.get(2));
                    totalNumberOfBirths += numberOfBirths;
                } else {
                    break;
                }
            }
        }
        return totalNumberOfBirths;
    }
}
