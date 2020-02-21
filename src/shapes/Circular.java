package shapes;

import utilities.Shape;

public class Circular extends Shape
{
    //Attributes
    private double radius;
    
    public Circular(double height, double area, double volume, double radius)
    {
        super(height, area, volume);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

}
