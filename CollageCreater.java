

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
        Picture demon = new Picture("images/demon.jpg");
        Picture vader = new Picture("images/vaderchoke.jpg");
        Picture vader1 = new Picture("images/vaderchoke.jpg");
        
        //demon.explore();
        
        //demon.edgeDetection(4);
        //demon.explore();
        
        //vader.explore();
        //vader.edgeDetection(10);
        //vader.explore();
        
        //demon.glassFilter(10);
        //demon.explore();
        
        /*
        vader.explore();
        vader.glassFilter(3);
        vader.explore();
        */
        
        /*
        demon.explore();
        demon.solarize(200);
        demon.explore();
        */
        
        vader.explore();
        vader.flipVertical();
        vader.explore();
        
        
        
        
        
        
    }
}

//