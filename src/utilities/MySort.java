package utilities;

import java.util.ArrayList;
import java.util.Comparator;

public class MySort 
{
    static long start, stop;
  

    public static <T extends Comparable <Shape>> void bubbleSort(ArrayList<Shape> list)
    {
        
        
        start = System.currentTimeMillis();
        //Calls the compareTo method only
        for (int i=0; i<list.size()-1; i++) 
        {
            for (int j=0; j < list.size()- i - 1; j++) {
                if (list.get(j).compareTo(list.get(j+1)) < 0)
                {
                    Shape temp = list.get(j);
                    list.set(j,list.get(j+1) );
                    list.set(j+1, temp);
                }
            }
        }
        stop = System.currentTimeMillis();
        
        System.out.println("Amount of time to complete Bubble sort: " + (stop-start) + "ms");
    }
    
    public static <t, T> void bubbleSort(ArrayList<Shape> list, Comparator<Shape> c)
    {
        start = System.currentTimeMillis();
        
        for (int i=0; i<list.size()-1; i++) 
        {
            for (int j=0; j < list.size()- i - 1; j++) {
                if (c.compare(list.get(j), list.get(j+1)) < 0)
                {
                    Shape temp = list.get(j);
                    list.set(j,list.get(j+1) );
                    list.set(j+1, temp);
                }
            }
        }
        stop = System.currentTimeMillis();
        
        System.out.println("Amount of time to complete Bubble sort: " + (stop-start) + "ms");
        
    }
    
    public static <T extends Comparable <Shape>> void selectionSort(ArrayList<T> list)
    {
        
    }
    
    public static <t, T> void selectionSort(ArrayList<Shape> list, Comparator<Shape> c)
    {
        //call the compare method only
    }

}
