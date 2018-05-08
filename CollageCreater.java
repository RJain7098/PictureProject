    

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
        Picture vader = new Picture("images/demon.jpg");
        Picture vader1 = new Picture("images/demon.jpg");
        Picture vader2 = new Picture("images/vaderchoke.jpg");
        Picture vader3 = new Picture("images/demon.jpg");
        Picture vader4 = new Picture("images/demon.jpg");
        Picture vader5 = new Picture("images/demon.jpg");
        Picture vader6 = new Picture("images/demon.jpg");
        
        
        //vader.show();
        vader.edgeDetection(5);
        vader1.glassFilter(5);
        vader2.recursive(vader2);
        vader3.solarize(180);
        vader4.flipVertical();
        
        
        //vader.show();
        //vader1.show();
        vader2.show();
        //vader3.show();
        //vader4.show();
        
        
        
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
        
        
        
        
        
        
        
        
    }
}

//