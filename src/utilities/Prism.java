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
    //Attributes
    private double side;
    
    //Constructor
    
    /**
     * The constructor for the Prism class.
     * @param height Height of the prism.
     * @param area Area of the prism.
     * @param volume volume of the prism.
     * @param side The base shape's side length.
     */
    public Prism(String name, double height, double area, double volume,double side)
    {
        super(name, height, area, volume);
        this.side = side;
    }

    /**
     * Gets the side length of the base shape.
     * @return The side length of the base shape.
     */
    public double getSide()
    {
        return side;
    }

    /**
     * Sets the side length of the base shape.
     * @param side
     */
    public void setSide(double side)
    {
        this.side = side;
    }
  
}
