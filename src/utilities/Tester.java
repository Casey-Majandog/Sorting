package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import shapes.Circular;
import shapes.OctagonalPrism;
import shapes.PentalgonalPrism;
import shapes.Pyramid;
import shapes.SquarePrism;
import shapes.TriangularPrism;

/**
 * The tester class is the driver for the program and takes user input to
 * conduct different types of sorts on shapes. The class then prints out the
 * results of the sort in descending order and should display the time it took
 * to do the chosen sorting algorithm.
 * 
 * @author Casey Majandog
 * @version 1.0 Created on February 19, 2020
 */
public class Tester
{

    // Attributes
    private String fileName;
    private String compareType;
    private String sortType;
    private static String shapeName;
    private static double volume;
    private static double area;
    private static double side;
    private static double radius;
    private static double height;
    private static int thousandth;
    private static String item;
    private static ArrayList<Shape> shapeList = new ArrayList<>();
    private static Shape shape;

    public static void main(String[] args) throws IOException
    {

        // How to bring arguments in
        // Run configurations
        // Use JOption pane for now, figure out how to using command prompt later
        for (String arg : args)
        {
            System.out.println(arg);
        }

        // Implement a method that will read from the file
        File file = new File("polyfor1.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String[] fileValues = null;
        while ((item = reader.readLine()) != null)
        {
            fileValues = item.split(" ");
        }
        reader.close();

        int i = 1;
        // Start at 1 to exclude the number of shaped in the file
        System.out.println("Amount of shapes in file: " + fileValues[0]);
        
        while (i < fileValues.length)
        {
            shapeName = fileValues[i];

            if(shapeName.equals("Cylinder"))
            {
                height = Double.parseDouble(fileValues[++i]);
                radius = Double.parseDouble(fileValues[++i]);
                area = Calculations.cylinderArea(radius);
                volume = Calculations.cylinderVolume(radius, height);

                shape = new Circular(height, area, volume, radius);
            }
            else if(shapeName.equals("Cone"))
            {
                height = Double.parseDouble(fileValues[++i]);
                radius = Double.parseDouble(fileValues[++i]);
                area = Calculations.coneArea(radius);
                volume = Calculations.coneVolume(radius, height);

                shape = new Circular(height, area, volume, radius);
            }
            else if(shapeName.equals("Pyramid"))
            {
                height = Double.parseDouble(fileValues[++i]);
                side = Double.parseDouble(fileValues[++i]);
                area = Calculations.pyramidArea(side);
                volume = Calculations.pyramidVolume(side, height);

                shape = new Pyramid(height, area, volume, side);
            }
            else if(shapeName.equals("SquarePrism"))
            {
                height = Double.parseDouble(fileValues[++i]);
                side = Double.parseDouble(fileValues[++i]);
                area = Calculations.sqrPrismArea(side);
                volume = Calculations.sqrPrismVolume(side, height);

                shape = new SquarePrism(height, area, volume, side);
            }
            else if(shapeName.equals("TriangularPrism"))
            {
                height = Double.parseDouble(fileValues[++i]);
                side = Double.parseDouble(fileValues[++i]);
                area = Calculations.triPrismArea(side);
                volume = Calculations.triPrismVolume(side, height);

                shape = new TriangularPrism(height, area, volume, side);
            }
            else if(shapeName.equals("PentagonalPrism"))
            {
                height = Double.parseDouble(fileValues[++i]);
                side = Double.parseDouble(fileValues[++i]);
                area = Calculations.pntPrismArea(side);
                volume = Calculations.pntPrismVolume(side, height);

                shape = new PentalgonalPrism(height, area, volume, side);
            }
            else if(shapeName.equals("OctagonalPrism"))
            {
                height = Double.parseDouble(fileValues[++i]);
                side = Double.parseDouble(fileValues[++i]);
                area = Calculations.pntPrismArea(side);
                volume = Calculations.pntPrismVolume(side, height);

                shape = new OctagonalPrism(height, area, volume, side);
            }

            shapeList.add(shape);
            i++;
        }

        int j = 0;
        
        System.out.println("Amount of shapes in shape list: " + shapeList.size());
        
        thousandth = 999;
        while (j < shapeList.size())
        {
            if(j == 0)
            {
                System.out.println("First Height of Shape: " + shapeList.get(j).getHeight());
            }
            else if(j == thousandth)
            {
                System.out.println("First Height of Shape: " + shapeList.get(j).getHeight());
                thousandth+=1000;
            }
            else if(j == shapeList.size()-1)
            {
                System.out.println("Last Height of Shape: " + shapeList.get(j).getHeight());
            }  
            
            j++;
        }

    }

}
