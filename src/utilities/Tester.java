package utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import compare.CompareArea;
import compare.CompareVolume;
import javafx.scene.control.TableColumn.SortType;
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
    private static long start, stop;
    private static String fileName;
    private static String compareType;
    private static String sortType;
    private static String subString;
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
    private static CompareArea ca = new CompareArea();
    private static CompareVolume cv = new CompareVolume();

    public static void main(String[] args) throws IOException
    {

        // How to bring arguments in
        // Run configurations
        // Use JOption pane for now, figure out how to using command prompt later
        for (String arg : args)
        {
           // System.out.println(arg);
            subString = arg.substring(1, 2);

            if (subString.equalsIgnoreCase("F"))
            {
                fileName = arg.substring(2);
                System.out.println("The file name is: " + fileName);
            } else if (subString.equalsIgnoreCase("T"))
            {
                compareType = arg.substring(2, 3);
                System.out.println("The compare type is: " + compareType);
            } else if (subString.equalsIgnoreCase("S"))
            {
                sortType = arg.substring(2, 3);
                System.out.println("The sort type is: " + sortType);
            }
        }

        // Implement a method that will read from the file
        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String[] fileValues = null;
        while ((item = reader.readLine()) != null)
        {
            fileValues = item.split(" ");
        }
        reader.close();

        // Start at 1 to exclude the number of shaped in the file
        int i = 1;
        while (i < fileValues.length)
        {
            shapeName = fileValues[i];

            if (shapeName.equals("Cylinder"))
            {
                height = Double.parseDouble(fileValues[++i]);
                radius = Double.parseDouble(fileValues[++i]);
                area = Calculations.cylinderArea(radius);
                volume = Calculations.cylinderVolume(radius, height);

                shape = new Circular(height, area, volume, radius);
            } else if (shapeName.equals("Cone"))
            {
                height = Double.parseDouble(fileValues[++i]);
                radius = Double.parseDouble(fileValues[++i]);
                area = Calculations.coneArea(radius);
                volume = Calculations.coneVolume(radius, height);
                shape = new Circular(height, area, volume, radius);
            } else if (shapeName.equals("Pyramid"))
            {
                height = Double.parseDouble(fileValues[++i]);
                side = Double.parseDouble(fileValues[++i]);
                area = Calculations.pyramidArea(side);
                volume = Calculations.pyramidVolume(side, height);

                shape = new Pyramid(height, area, volume, side);
            } else if (shapeName.equals("SquarePrism"))
            {
                height = Double.parseDouble(fileValues[++i]);
                side = Double.parseDouble(fileValues[++i]);
                area = Calculations.sqrPrismArea(side);
                volume = Calculations.sqrPrismVolume(side, height);

                shape = new SquarePrism(height, area, volume, side);
            } else if (shapeName.equals("TriangularPrism"))
            {
                height = Double.parseDouble(fileValues[++i]);
                side = Double.parseDouble(fileValues[++i]);
                area = Calculations.triPrismArea(side);
                volume = Calculations.triPrismVolume(side, height);

                shape = new TriangularPrism(height, area, volume, side);
            } else if (shapeName.equals("PentagonalPrism"))
            {
                height = Double.parseDouble(fileValues[++i]);
                side = Double.parseDouble(fileValues[++i]);
                area = Calculations.pntPrismArea(side);
                volume = Calculations.pntPrismVolume(side, height);

                shape = new PentalgonalPrism(height, area, volume, side);
            } else if (shapeName.equals("OctagonalPrism"))
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

        //Check sort here
        if (sortType.equalsIgnoreCase("B"))
        {
            if (compareType.equalsIgnoreCase("H"))
                MySort.bubbleSort(shapeList);
            else if(compareType.equalsIgnoreCase("A"))
                MySort.bubbleSort(shapeList, ca);
            else if(compareType.equalsIgnoreCase("V"))
                MySort.bubbleSort(shapeList, cv);
        }
        else if (sortType.equalsIgnoreCase("S"))
        {
            if (compareType.equalsIgnoreCase("H"))
                MySort.selectionSort(shapeList);
            else if(compareType.equalsIgnoreCase("A"))
                MySort.selectionSort(shapeList, ca);
            else if(compareType.equalsIgnoreCase("V"))
                MySort.selectionSort(shapeList, cv);
        }
        else if (sortType.equalsIgnoreCase("I"))
        {
            if (compareType.equalsIgnoreCase("H"))
                MySort.insertionSort(shapeList);
            else if(compareType.equalsIgnoreCase("A"))
                MySort.insertionSort(shapeList, ca);
            else if(compareType.equalsIgnoreCase("V"))
                MySort.insertionSort(shapeList, cv);
        }
        else if (sortType.equalsIgnoreCase("M"))
        {
            if (compareType.equalsIgnoreCase("H"))
            {
                start = System.currentTimeMillis();
                shapeList = MySort.mergeSort(shapeList);
                stop = System.currentTimeMillis();
                System.out.println("Amount of time to complete Merge sort: " + (stop - start) + "ms");
            }
            else if (compareType.equalsIgnoreCase("A"))
            {
                start = System.currentTimeMillis();
                shapeList = MySort.mergeSort(shapeList, ca);
                stop = System.currentTimeMillis();
                System.out.println("Amount of time to complete Merge sort: " + (stop - start) + "ms");
            }
            else if (compareType.equalsIgnoreCase("V"))
            {
                start = System.currentTimeMillis();
                shapeList = MySort.mergeSort(shapeList, cv);
                stop = System.currentTimeMillis();
                System.out.println("Amount of time to complete Merge sort: " + (stop - start) + "ms");
            }
        }
        else if (sortType.equalsIgnoreCase("Q"))
        {
            if (compareType.equalsIgnoreCase("H"))
            {
                start = System.currentTimeMillis();
                MySort.quickSort(shapeList,0,(shapeList.size()));
                stop = System.currentTimeMillis();
                System.out.println("Amount of time to complete Quick sort: " + (stop - start) + "ms");
            }
            else if(compareType.equalsIgnoreCase("A"))
            {
                start = System.currentTimeMillis();
                MySort.quickSort(shapeList,0,(shapeList.size()),ca);
                stop = System.currentTimeMillis();
                System.out.println("Amount of time to complete Quick sort: " + (stop - start) + "ms");
            }
            else if(compareType.equalsIgnoreCase("V"))
            {
                start = System.currentTimeMillis();
                MySort.quickSort(shapeList,0,(shapeList.size()),cv);
                stop = System.currentTimeMillis();
                System.out.println("Amount of time to complete Quick sort: " + (stop - start) + "ms");
            }
        }
        else if (sortType.equalsIgnoreCase("Z"))
        {
            if (compareType.equalsIgnoreCase("H"))
                MySort.cocktailSort(shapeList);
            else if(compareType.equalsIgnoreCase("A"))
                MySort.cocktailSort(shapeList, ca);
            else if(compareType.equalsIgnoreCase("V"))
                MySort.cocktailSort(shapeList, cv);
        }


        // Print out list AFTER it gets sorted
        int j = 0;
        thousandth = 999;
        while (j < shapeList.size())
        {
            if (compareType.equalsIgnoreCase("H"))
            {
                if (j == 0)
                {
                    System.out.println("First height of sorted Shape list: " + shapeList.get(j).getHeight());
                } else if (j == thousandth)
                {
                    System.out.println("Every thousandth height of sorted Shape list: " + shapeList.get(j).getHeight());
                    thousandth += 1000;
                } else if (j == shapeList.size() - 1)
                {
                    System.out.println("Last height of sorted Shape list: " + shapeList.get(j).getHeight());
                }
            }
            else if (compareType.equalsIgnoreCase("A"))
            {
                if (j == 0)
                {
                    System.out.println("First base area of sorted Shape list: " + shapeList.get(j).getArea());
                } else if (j == thousandth)
                {
                    System.out.println("Every thousandth base area of sorted Shape list: " + shapeList.get(j).getArea());
                    thousandth += 1000;
                } else if (j == shapeList.size() - 1)
                {
                    System.out.println("Last base area of sorted Shape list: " + shapeList.get(j).getArea());
                }
            }
            else if (compareType.equalsIgnoreCase("V"))
            {
                if (j == 0)
                {
                    System.out.println("First volume of sorted Shape list: " + shapeList.get(j).getVolume());
                } 
                else if (j == thousandth)
                {
                    System.out.println("Every thousandth volume of sorted Shape list: " + shapeList.get(j).getVolume());
                    thousandth += 1000;
                } 
                else if (j == shapeList.size() - 1)
                {
                    System.out.println("Last volume of sorted Shape list: " + shapeList.get(j).getVolume());
                }
//                else
//                {
//                    System.out.println("Every thousandth volume of sorted Shape list: " + shapeList.get(j).getVolume());
//                }
            }

            j++;
        }

    }

}
