package utilities;



/**
 * An abstract class shape that contains the attributes
 * that are shared across all shapes.
 * 
 * @author Casey Majandog
 * @version 1.0
 * Created on February 19, 2020
 */
public abstract class Shape  
{
    //Attributes
    private double height;
    private double area;
    private double volume;
    
    
    //Constructor
    
    /**
     * Constructor for the Shape class
     * 
     * @param height Height of the shape
     * @param area Area of the base polygon of shape
     * @param volume Volue of the shape
     */
    public Shape(double height, double area, double volume)
    {
        super();
        this.height = height;
        this.area = area;
        this.volume = volume;
    }

    //Setters and getters
    public double getHeight()
    {
        return height;
    }



    public void setHeight(double height)
    {
        this.height = height;
    }



    public double getArea()
    {
        return area;
    }



    public void setArea(double area)
    {
        this.area = area;
    }



    public double getVolume()
    {
        return volume;
    }



    public void setVolume(double volume)
    {
        this.volume = volume;
    }

    
    
}
