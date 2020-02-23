package utilities;

/**
 * Calculations class has methods to calculate the volume and area
 * of certain shapes.
 * 
 * @author Casey Majandog
 * @version 1.0 
 * Created on February 20, 2020
 */
public class Calculations
{
    //Static attributes
    private static double area;
    private static double volume;
    
    /**
     * Calculates the area of a cylinders base shape.
     * 
     * @param radius The radius of the base shape.
     * @return The area of a cylinder.
     */
    public static double cylinderArea(double radius)
    {
        area = Math.PI*(Math.pow(radius, 2)); 
        return area;
        
    }
    
    /**
     * Calculates the volume of a cylinder.
     * 
     * @param radius The radius of a cylinders base shape.
     * @param height The height of a cylinder.
     * @return The volume of a cylinder.
     */
    public static double cylinderVolume(double radius, double height)
    {
        volume = Math.PI*(Math.pow(radius, 2))*height;
        return volume;        
    }
    
    /**
     * Calculates the area of a cones base shape.
     * 
     * @param radius The radius of the base shape.
     * @return The area of a cones base shape.
     */
    public static double coneArea(double radius)
    {
        area = Math.PI*(Math.pow(radius, 2)); 
        return area;
        
    }
    
    /**
     * Calculates the volume of a cone.
     * 
     * @param radius The radius of a base shape.
     * @param height The height of a cone.
     * @return The volume of a cone.
     */
    public static double coneVolume(double radius, double height)
    {
        volume = (0.33)*Math.PI*Math.pow(radius, 2)*height;
        return volume;        
    }
    
    /**
     * Calculates the area of a pyramids base shape.
     * 
     * @param side The length of the pyramids base shape.
     * @return The area of a pyramids base shape.
     */
    public static double pyramidArea(double side)
    {
        area = (Math.pow(side, 2)); 
        return area;
    }
    
    /**
     * Calculates the volume of a pyramid.
     * 
     * @param side The length of a pyramids base shape.
     * @param height The height of a pyramid.
     * @return The volume of a pyramid.
     */
    public static double pyramidVolume(double side, double height)
    {
        volume = (0.33)*(Math.pow(side, 2))*height;
        return volume;        
    }
    
    /**
     * Calculates the area of a square prism's base shape.
     * 
     * @param side The length of the square prism's base shape.
     * @return The area of a square prism's base shape.
     */
    public static double sqrPrismArea(double side)
    {
        area = (Math.pow(side, 2)); 
        return area;
    }
    
    /**
     * Calculates the volume of a square prism.
     * 
     * @param side The length of the square prism's base shape.
     * @param height The height of a square prism.
     * @return The volume of a square prism.
     */
    public static double sqrPrismVolume(double side, double height)
    {
        volume = (Math.pow(side, 2))*height;
        return volume;        
    }
    
    /**
     * Calculates the area of a triangular prism's base shape.
     * 
     * @param side The length of the triangular prism's base shape.
     * @return The area of a triangular prism's base shape.
     */
    public static double triPrismArea(double side)
    {
        area = ((Math.pow(side, 2))*Math.sqrt(3))/4; 
        return area;
    }
    
    /**
     * Calculates the volume of a triangular prism.
     * 
     * @param side The length of the triangular prism's base shape.
     * @param height The height of a triangular prism.
     * @return The volume of a triangular prism.
     */
    public static double triPrismVolume(double side, double height)
    {
        volume =  (((Math.pow(side, 2))*Math.sqrt(3))/4)*height;
        return volume;        
    }
    
    /**
     * Calculates the area of a pentagonal prism's base shape.
     * 
     * @param side The length of the pentagonal prism's base shape.
     * @return The area of a pentagonal prism's base shape.
     */
    public static double pntPrismArea(double side)
    {
        area = (5*(Math.pow(side, 2))*Math.tan(54))/4; 
        return area;
    }
    
    /**
     * Calculates the volume of a pentagonal prism.
     * 
     * @param side The length of the pentagonal prism's base shape.
     * @param height The height of a pentagonal prism.
     * @return The volume of a pentagonal prism.
     */
    public static double pntPrismVolume(double side, double height)
    {
        volume =  ((5*(Math.pow(side, 2))*Math.tan(54))/4)*height;
        return volume;        
    }
    
    /**
     * Calculates the area of a octagonal prism's base shape.
     * 
     * @param side The length of the octagonal prism's base shape.
     * @return The area of a octagonal prism's base shape.
     */
    public static double octPrismArea(double side)
    {
        area = (5*(Math.pow(side, 2))*Math.tan(54))/4; 
        return area;
    }
    
    /**
     * Calculates the volume of a octagonal prism.
     * 
     * @param side The length of the octagonal prism's base shape.
     * @param height The height of a octagonal prism.
     * @return The volume of a octagonal prism.
     */
    public static double octPrismVolume(double side, double height)
    {
        volume =  ((5*(Math.pow(side, 2))*Math.tan(54))/4)*height;
        return volume;        
    }
    
    
    
}
