package compare;

import java.util.Comparator;

import utilities.Shape;

/**
 * A class that implements the Comparator class to compare two shape by their
 * volume.
 * 
 * @author Casey Majandog 
 * @version 1.0
 * Created on February 20, 2020
 */
public class CompareVolume implements Comparator<Shape>
{

    /**
     * Compares two shapes based on their volume.
     * 
     * @param shape1 First shape to compare with.
     * @param shape2 Second shape to compare with.
     */
    @Override
    public int compare(Shape shape1, Shape shape2)
    {
        if (shape1.getVolume() > shape2.getVolume())
        {
            return 1;
        } else if (shape1.getVolume() < shape2.getVolume())
        {
            return -1;
        } else
        {
            return 0;
        }

    }
}
