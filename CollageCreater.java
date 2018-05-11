    

/**
 * Write a description of class CollageCreater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollageCreater
{
    public static void main(String[] args)
    {
        //This is just a jumble of random code I used for testing - running it may or may not work based on what has already been saved
        //I used this file to create the collage
        
        Picture canvas = new Picture("images/canvas.jpg");
        
        Picture vader = new Picture("images/bigvader.jpg");
        Picture vader1 = new Picture("images/bigvader.jpg");
        Picture vader2 = new Picture("images/bigvader.jpg");
        Picture vader3 = new Picture("images/bigvader.jpg");
        Picture vader4 = new Picture("images/bigvader.jpg");
        Picture vader5 = new Picture("images/bigvader.jpg");
        Picture vader6 = new Picture("images/bigvader.jpg");
        
        
        //vader.explore();
        
        vader.recursive(vader);
        vader1.flipVertical();
        vader2.solarize(200);
        vader3.glassFilter(10);
        vader4.edgeDetection(7);
        
        
        //vader.explore();
        //vader1.explore();
        //vader2.explore();
        //vader3.explore();
        //vader4.explore();
        
        vader.write("images/recursive.jpg");
        vader1.write("images/flipped.jpg");
        vader2.write("images/solarize.jpg");
        vader3.write("images/glassFilter.jpg");
        vader4.write("images/edgeDetection.jpg");
        
        
        canvas.copy(vader, 0, 0);
        canvas.copy(vader1, 549, 0);
        canvas.copy(vader2, 1098, 0);
        canvas.copy(vader3, 0, 825);
        canvas.copy(vader4, 549, 825);
        canvas.copy(vader5, 1098, 825);
        canvas.explore();
        
        canvas.write("images/collage.jpg");
        
        
        
        
        
        
        
        
        
    }
}

//