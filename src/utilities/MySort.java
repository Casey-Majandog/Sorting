package utilities;

import java.util.ArrayList;
import java.util.Comparator;

public class MySort 
{
    static long start, stop;
  

    public static <T extends Comparable <Shape>> void bubbleSort(ArrayList<Shape> list)
    {
        
        
        start = System.currentTimeMillis();
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
    
    //Referenced Code: https://codereview.stackexchange.com/questions/225751/selection-sort-java-arraylist
    public static <T extends Comparable <Shape>> void selectionSort(ArrayList<Shape> list)
    {
        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            //The index of the biggest number
            int maxIndex = i;           
            for (int j = i; j < list.size(); j++) {
                if (list.get(maxIndex).compareTo(list.get(j)) < 0)
                {
                    maxIndex = j;
                }
            }       
            Shape temp = list.get(i);
            list.set(i,list.get(maxIndex));
            list.set(maxIndex, temp);
        }
        stop = System.currentTimeMillis();
        System.out.println("Amount of time to complete Selection sort: " + (stop-start) + "ms");
    }
    
    public static <t, T> void selectionSort(ArrayList<Shape> list, Comparator<Shape> c)
    {
        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            //The index of the biggest number
            int maxIndex = i;           
            for (int j = i; j < list.size(); j++) {
                if (c.compare(list.get(maxIndex), list.get(j)) < 0)
                {
                    maxIndex = j;
                }
            }       
            Shape temp = list.get(i);
            list.set(i,list.get(maxIndex));
            list.set(maxIndex, temp);
        }
        stop = System.currentTimeMillis();
        System.out.println("Amount of time to complete Selection sort: " + (stop-start) + "ms");
    }
    
    public static <T extends Comparable <Shape>> void insertionSort(ArrayList<Shape> list)
    {
        
    }
    
    public static <t, T> void insertionSort(ArrayList<Shape> list, Comparator<Shape> c)
    {
       
    }
    
    public static <T extends Comparable <Shape>> void mergeSort(ArrayList<Shape> list)
    {
        
    }
    
    public static <t, T> void mergeSort(ArrayList<Shape> list, Comparator<Shape> c)
    {
       
    }
    
    public static <T extends Comparable <Shape>> void quickSort(ArrayList<Shape> list)
    {
        
    }
    
    public static <t, T> void quickSort(ArrayList<Shape> list, Comparator<Shape> c)
    {
       
    }
    
    //Rename later
    public static <T extends Comparable <Shape>> void mySort(ArrayList<Shape> list)
    {
        
    }
    
    public static <t, T> void mySort(ArrayList<Shape> list, Comparator<Shape> c)
    {
       
    }

}
