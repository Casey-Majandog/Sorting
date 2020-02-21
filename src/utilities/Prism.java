package utilities;


/**
 * An abstract class prism that contains the common attributes
 * of other prism objects
 * 
 * @author Casey Majandog
 * @version 1.0
 * Created on February 19, 2020
 */
public abstract class Prism extends Shape 
{
    //attributes
    private double side;
    
    public Prism(double height, double area, double volume,double side)
    {
        super(height, area, volume);
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }
  
}
