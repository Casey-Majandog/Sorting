package utilities;

/**
 * An abstract class shape that contains the attributes that are shared across
 * all shapes.
 * 
 * @author Casey Majandog
 * @version 1.0 Created on February 19, 2020
 */
public abstract class Shape implements Comparable<Shape>
{
    // Attributes
    private double height;
    private double area;
    private double volume;
    private String name;

    // Constructor

    /**
     * Constructor for the Shape class.
     * 
     * @param height Height of the shape.
     * @param area   Area of the base polygon of shape.
     * @param volume Volume of the shape.
     */
    public Shape(String name, double height, double area, double volume)
    {
        super();
        this.name = name;
        this.height = height;
        this.area = area;
        this.volume = volume;
    }

    // Setters and getters

    /**
     * Gets the height of a shape.
     * 
     * @return The height of a shape.
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * sets the height of a shape.
     * @param height Height of the shape.
     */
    public void setHeight(double height)
    {
        this.height = height;
    }

    /**
     * Gets the area of a shape.
     * 
     * @return The area of a shape.
     */
    public double getArea()
    {
        return area;
    }

    /**
     * Sets the area of a shape.
     * @param area The area of the shape.
     */
    public void setArea(double area)
    {
        this.area = area;
    }

    /**
     * Gets the volume of a shape.
     * @return The volume of a shape.
     */
    public double getVolume()
    {
        return volume;
    }

    /**
     * Sets the volume of a shape.
     * @param volume the volume of the shape.
     */
    public void setVolume(double volume)
    {
        this.volume = volume;
    }
    
    /**
     * Gets the name of a shape.
     * @param name the name of the shape.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the name of a shape.
     * @param name the name of the shape.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Compares the height of the current shape to another shape.
     * @param shape The other shape.
     */
    @Override
    public int compareTo(Shape shape)
    {
        if (this.height > shape.height)
        {
            return 1;
        } else if (this.height < shape.height)
        {
            return -1;
        } else
        {
            return 0;
        }

    }

   

}
