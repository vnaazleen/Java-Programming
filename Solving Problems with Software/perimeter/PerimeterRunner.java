package perimeter;

 
import java.io.File;
import edu.duke.*;

public class PerimeterRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (FileResource file) {
        int count = 0;
        for (String line: file.lines()) {
            count += 1;
        }
        return count;
    }
    
    public double getAverageLength  (int numPoints, double length) {
        return length / numPoints;
    }

    public double getLargestSide (Shape s) {
        double largestSide = -1;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update LargestSide by checking if it is greater currDist or not
            if (largestSide < currDist) {
                largestSide = currDist;
            }            
        }
        return largestSide;
    }
    
    public double getLargestX (Shape s) {
        double largestX = s.getLastPoint().getX();
        for (Point currPt : s.getPoints()) {
            if (currPt.getX() > largestX) {
                largestX = currPt.getX();
            }
        }
        return largestX;
    }
    
    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        int numPoints = getNumPoints(fr);
        double length = getPerimeter(s);
        double averageLength = getAverageLength (numPoints, length);
        double largestSide = getLargestSide (s);
        double largestX = getLargestX (s);
        System.out.println("perimeter = " + length);
        System.out.println("number of lines = " + numPoints);
        System.out.println("average length of side = " + averageLength);
        System.out.println("largest side = " + largestSide);
        System.out.println("largest x value = " + largestX);
    }

    public double getLargestPerimeterMultipleFiles() {
        double LargestPerimeter = -1;
        double CurrPerimeter;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            CurrPerimeter = getPerimeter(s);
            if (LargestPerimeter < CurrPerimeter) {
                LargestPerimeter = CurrPerimeter;
            }
        }
        return LargestPerimeter;
    }
    
    public void testPerimeterMultipleFiles() {
        System.out.println(getLargestPerimeterMultipleFiles());
    }
    
    public File getFileWithLargestPerimeter() {
        double LargestPerimeter = -1;
        double CurrPerimeter;
        File LargestPerimeterFile = null;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            CurrPerimeter = getPerimeter(s);
            if (LargestPerimeter < CurrPerimeter) {
                LargestPerimeter = CurrPerimeter;
                LargestPerimeterFile = f;
            }
        }
        return LargestPerimeterFile;
    }
    
    public void testFileWithLargestPerimeter() {
        System.out.println(getFileWithLargestPerimeter());
    }
    
    public static void main (String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
        //pr.testPerimeterMultipleFiles();
        //pr.testFileWithLargestPerimeter();
    }
}
