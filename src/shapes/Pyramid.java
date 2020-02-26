package shapes;

import utilities.Prism;
import utilities.Shape;

/**
 * A object class for a pyramid. Extends the Prism class.
 * 
 * @author Casey Majandog
 * @version 1.0
 * Created on February 20, 2020
 */
public class Pyramid extends Prism
{
    /**
     * Constructor of the Pyramid class.
     * @param height Height of the prism.
     * @param area Area of the prism.
     * @param volume Volume of the prism.
     * @param side Side length of the base shape.
     */
    public Pyramid(double height, double area, double volume, double side)
    {
        super(height, area, volume, side);
    }
 
}
