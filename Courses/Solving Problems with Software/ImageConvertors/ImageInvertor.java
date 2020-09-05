/**
 * Create a inverted version of an image by setting each color components of each pixel to the its inverted value.
 * 
 * @author Vaseem Naazleen Shaik
 */
import edu.duke.*;
import java.io.*;

public class ImageInvertor {
    //I started with the image I wanted (inImage)
        public ImageResource invert(ImageResource inImage) {
        //I made a blank image of the same size
        ImageResource outImage = new ImageResource(inImage.getWidth(), inImage.getHeight());
        //for each pixel in outImage
        for (Pixel pixel: outImage.pixels()) {
            //look at the corresponding pixel in inImage
            Pixel inPixel = inImage.getPixel(pixel.getX(), pixel.getY());
            //compute inPixel's red + inPixel's blue + inPixel's green
            //divide that sum by 3 (call it average)
            int red = Math.abs(255 - inPixel.getRed());
            int green = Math.abs(255 - inPixel.getGreen());
            int blue = Math.abs(255 - inPixel.getBlue());
            //set pixel's red to average
            pixel.setRed(red);
            //set pixel's green to average
            pixel.setGreen(green);
            //set pixel's blue to average
            pixel.setBlue(blue);
        }
        //outImage is your answer
        return outImage;
    }

    public void selectAndInvert() {
        DirectoryResource dr = new DirectoryResource();
        for (File f: dr.selectedFiles()) {
            ImageResource inImage = new ImageResource(f);
            ImageResource inverted = invert(inImage);
            String fname = f.getName();
            String newName = "inverted-" + fname;
            inverted.setFileName(newName);
            inverted.draw();
            inverted.save();
        }
    }

}
