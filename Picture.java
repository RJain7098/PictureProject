// Rishabh Jain
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from
 * SimplePicture and allows the student to add functionality to
 * the Picture class.
 *
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture
{
  ///////////////////// constructors //////////////////////////////////

  /**
   * Constructor that takes no arguments
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor
     */
    super();
  }

  /**
   * Constructor that takes a file name and creates the picture
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }

  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }

  /**
   * Constructor that takes a picture and creates a
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }

  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }

  ////////////////////// methods ///////////////////////////////////////

  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() +
      " height " + getHeight()
      + " width " + getWidth();
    return output;

  }

  public static void main(String[] args)
  {
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
  }

  //-----------------------MY METHODS---------------------------------
  public void gray()
  {
      Pixel[] pixelArray = this.getPixels(); //copies ALL PIXELS INTO AN ARRAY, too much memory
      int average = 0;
      for (Pixel spot : pixelArray) // grayscale
      {
          average += spot.getRed();
          average += spot.getBlue();
          average += spot.getGreen();
          average = average/3;

          spot.setRed(average);
          spot.setBlue(average);
          spot.setGreen(average);

       }
       this.explore();


  }

  //this is a better way to do it, copy EACH pixel individually one by one
  public void copyKatie(Picture sourcePicture)
  {
      //String sourceFile = ();
      //Picture sourcePicture = new Picture(sourceFile);

      Pixel sourcePixel = null;
      Pixel targetPixel = null;

      //width of the source must be <= the canvas we are copying to
      //loop through the columns
      for (int sourceX = 0, targetX = 50;
           sourceX < sourcePicture.getWidth();
           sourceX++, targetX++)
      {
          //loop through the rows
          for (int sourceY = 0, targetY = 50;
               sourceY < sourcePicture.getHeight();
               sourceY++, targetY++)
          {
              //good to copy one pixel at a time for large pictures rather than the entire array
              //set the target pixel color the source pixel color
              sourcePixel = sourcePicture.getPixel(sourceX, sourceY); //gets source pixel
              targetPixel = this.getPixel(targetX, targetY); //gets target pixel
              targetPixel.setColor(sourcePixel.getColor()); //sets target pixel color to the source pixel color

          }

        }
  }//end of copy
  
  
  /**
   * Methd to mirror around a vertical line in the middle
   * of the picture based on the width
   */
  public void mirrorVertical()
  {
      int width = this.getWidth();
      int mirrorPoint = width/2;
      
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      //loop through all the rows
      for (int y = 0; y < getHeight(); y++)
      {
          //loop from 0 to the middle(mirror point) columns
          for (int x = 0; x < mirrorPoint; x++)
          {
              leftPixel = getPixel(x, y); //get the pixel on the left side of the mirror
              rightPixel = getPixel(width - 1 - x, y); //get the pixel on the right side of the mirror going inwards
              rightPixel.setColor(leftPixel.getColor()); //sets the right pixel equal to the left pixel
          }
      }
      
      
  } //end of mirrorVertical
  
  /**
   * Method to mirror around a horizontal line in the middle from top to bottom
   */
  public void mirrorHorizontal()
  {
      int height = this.getHeight();
      int mirrorPoint = height/2;
      
      Pixel topPixel = null;
      Pixel botPixel = null;
      
      for (int x = 0; x < getWidth(); x++)
      {
          for (int y = 0; y < mirrorPoint; y++)
          {
              topPixel = getPixel(x, y);
              botPixel = getPixel(x, height - 1 -y);
              botPixel.setColor(topPixel.getColor());
          }
      }
  }
  
  /**
   * Method to mirror over a horizontal line from bottom to top
   */
  public void mirrorBotToTop()
  {
      int height = this.getHeight();
      int mirrorPoint = height/2;
      
      Pixel topPixel = null;
      Pixel botPixel = null;
      
      for (int x = 0; x < getWidth(); x++)
      {
          for (int y = 0; y < mirrorPoint; y++)
          {
              botPixel = getPixel(x, height - 1 -y);
              topPixel = getPixel(x, y);
              topPixel.setColor(botPixel.getColor());
          }
      }
  }
  
  /**
   * Fixes a temple
   */
  public void mirrorTemple()
  {
      int mirrorPoint = 276;
      
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      
      for (int y = 0; y < getHeight(); y++)
      {
          for (int x = 0; x < mirrorPoint; x++)
          {
              leftPixel = getPixel(x, y);
              rightPixel = getPixel(552-x-1, y);
              rightPixel.setColor(leftPixel.getColor());
          }
      }
  }
  
  public void copySmaller(String filename)
  {
      Picture picture = new Picture(filename);
      
      Pixel sourcePixel = null;
      Pixel targetPixel = null;
      
      //loop through the columns
      for (int sourceX = 0, targetX = 0; sourceX < picture.getWidth(); sourceX += 2, targetX++)
      {
          
          //loop through the rows
          for (int sourceY = 0, targetY = 0; sourceY < picture.getHeight(); sourceY += 2, targetY++)
          {
              //set the target pixel color the ource pixel color
              sourcePixel = picture.getPixel(sourceX, sourceY);
              targetPixel = this.getPixel(targetX, targetY);
              targetPixel.setColor(sourcePixel.getColor());
          }
          
      }
              
              
  }

} // this } is the end of class Picture, put all new methods before this
