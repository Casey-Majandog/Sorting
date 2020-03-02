package shapes;

import utilities.Prism;

/**
 * A object class for a square prism. Extends the Prism class.
 * 
 * @author Casey Majandog
 * @version 1.0
 * Created on February 20, 2020
 */
public class SquarePrism extends Prism
{
    /**
     * Constructor of the SquarePrism class.
     * @param name Name of the prism.
     * @param height Height of the prism.
     * @param area Area of the prism.
     * @param volume Volume of the prism.
     * @param side Side length of the base shape.
     */
    public SquarePrism(String name, double height, double area, double volume, double side)
    {
        super(name, height, area, volume, side);
    }

}
