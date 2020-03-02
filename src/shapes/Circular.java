package shapes;

import utilities.Shape;

/**
 * A object class for any shape that has a circular base. Extends the Shape class.
 * 
 * @author Casey Majandog
 * @version 1.0
 * Created on February 20, 2020
 */
public class Circular extends Shape
{
    //Attributes
    private double radius;
    
    /**
     * Constructor for the circular class.
     * 
     * @param name Name of the shape.
     * @param height Height of the shape.
     * @param area Base area of the shape.
     * @param volume Volume of the shape.
     * @param radius Radius of the base shape.
     */
    public Circular(String name, double height, double area, double volume, double radius)
    {
        super(name, height, area, volume);
        this.radius = radius;
    }

    /**
     * Gets the radius of the base shape.
     * 
     * @return Radius of base shape.
     */
    public double getRadius()
    {
        return radius;
    }

    /**
     * Sets the radius of the base shape.
     */
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

}
