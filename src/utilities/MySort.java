package utilities;

import java.util.ArrayList;
import java.util.Comparator;

public class MySort
{
    private static long start, stop;

    public static <T extends Comparable<Shape>> void bubbleSort(ArrayList<Shape> list)
    {

        start = System.currentTimeMillis();
        for (int i = 0; i < list.size() - 1; i++)
        {
            for (int j = 0; j < list.size() - i - 1; j++)
            {
                if (list.get(j).compareTo(list.get(j + 1)) < 0)
                {
                    Shape temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        stop = System.currentTimeMillis();

        System.out.println("Amount of time to complete Bubble sort: " + (stop - start) + "ms");
    }

    public static <t, T> void bubbleSort(ArrayList<Shape> list, Comparator<Shape> c)
    {
        start = System.currentTimeMillis();

        for (int i = 0; i < list.size() - 1; i++)
        {
            for (int j = 0; j < list.size() - i - 1; j++)
            {
                if (c.compare(list.get(j), list.get(j + 1)) < 0)
                {
                    Shape temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        stop = System.currentTimeMillis();

        System.out.println("Amount of time to complete Bubble sort: " + (stop - start) + "ms");

    }

    // Referenced Code:
    // https://codereview.stackexchange.com/questions/225751/selection-sort-java-arraylist
    public static <T extends Comparable<Shape>> void selectionSort(ArrayList<Shape> list)
    {
        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++)
        {
            // The index of the biggest number
            int maxIndex = i;
            for (int j = i; j < list.size(); j++)
            {
                if (list.get(maxIndex).compareTo(list.get(j)) < 0)
                {
                    maxIndex = j;
                }
            }
            Shape temp = list.get(i);
            list.set(i, list.get(maxIndex));
            list.set(maxIndex, temp);
        }
        stop = System.currentTimeMillis();
        System.out.println("Amount of time to complete Selection sort: " + (stop - start) + "ms");
    }

    public static <t, T> void selectionSort(ArrayList<Shape> list, Comparator<Shape> c)
    {
        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++)
        {
            // The index of the biggest number
            int maxIndex = i;
            for (int j = i; j < list.size(); j++)
            {
                if (c.compare(list.get(maxIndex), list.get(j)) < 0)
                {
                    maxIndex = j;
                }
            }
            Shape temp = list.get(i);
            list.set(i, list.get(maxIndex));
            list.set(maxIndex, temp);
        }
        stop = System.currentTimeMillis();
        System.out.println("Amount of time to complete Selection sort: " + (stop - start) + "ms");
    }

    public static <T extends Comparable<Shape>> void insertionSort(ArrayList<Shape> list)
    {
        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++)
        {
            int j = i;
            while (j > 0 && list.get(j - 1).compareTo(list.get(j)) < 0)
            {
                Shape temp = list.get(j);
                list.set(j, list.get(j - 1));
                list.set(j - 1, temp);
                j = j - 1;
            }
        }
        stop = System.currentTimeMillis();

        System.out.println("Amount of time to complete Insertion sort: " + (stop - start) + "ms");
    }

    public static <t, T> void insertionSort(ArrayList<Shape> list, Comparator<Shape> c)
    {
        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++)
        {
            int j = i;
            while (j > 0 && c.compare(list.get(j - 1), list.get(j)) < 0)
            {
                Shape temp = list.get(j);
                list.set(j, list.get(j - 1));
                list.set(j - 1, temp);
                j = j - 1;
            }
        }
        stop = System.currentTimeMillis();

        System.out.println("Amount of time to complete Insertion sort: " + (stop - start) + "ms");
    }

    public static <T extends Comparable<Shape>> ArrayList<Shape> mergeSort(ArrayList<Shape> list)
    {
        if (list.size() <= 1)
        {
            return list;
        }

        int begin = 0;
        int midpoint = list.size() / 2;

        int end = list.size();

        // Splits array in half
        ArrayList<Shape> leftList = new ArrayList<Shape>();
        ArrayList<Shape> rightList = new ArrayList<Shape>();

        for (int index = begin; index < midpoint; index++)
        {
            leftList.add(list.get(index));
        }

        for (int index = midpoint; index < end; index++)
        {
            rightList.add(list.get(index));
        }

        // Recursion to split the list into individual elements
        leftList = mergeSort(leftList);
        rightList = mergeSort(rightList);
        return mergeComparable(leftList, rightList);
    }

    public static <t, T> ArrayList<Shape> mergeSort(ArrayList<Shape> list, Comparator<Shape> c)
    {
        if (list.size() <= 1)
        {
            return list;
        }

        int begin = 0;
        int midpoint = list.size() / 2;

        int end = list.size();

        // Splits array in half
        ArrayList<Shape> leftList = new ArrayList<Shape>();
        ArrayList<Shape> rightList = new ArrayList<Shape>();

        for (int index = begin; index < midpoint; index++)
        {
            leftList.add(list.get(index));
        }

        for (int index = midpoint; index < end; index++)
        {
            rightList.add(list.get(index));
        }

        // Recursion to split the list into individual elements
        leftList = mergeSort(leftList, c);
        rightList = mergeSort(rightList, c);

        return mergeComparator(leftList, rightList, c);
    }

    // Choosing the end number as the pivot
    public static <T extends Comparable<Shape>> void quickSort(ArrayList<Shape> list, int leftIndex, int rightIndex)
    {
        if (leftIndex < rightIndex)
        {
            int p = partitionComparable(list, leftIndex, rightIndex);
            quickSort(list, leftIndex, p - 1);
            quickSort(list, p + 1, rightIndex);
        }
    }

    public static <t, T> void quickSort(ArrayList<Shape> list,int leftIndex, int rightIndex, Comparator<Shape> c)
    {
        if (leftIndex < rightIndex)
        {
            int p = partitionComparator(list, leftIndex, rightIndex, c);
            quickSort(list, leftIndex, p - 1,c);
            quickSort(list, p + 1, rightIndex,c);
        }
    }

    // COCKTAIL SOOOORT
    public static <T extends Comparable<Shape>> void cocktailSort(ArrayList<Shape> list)
    {
        start = System.currentTimeMillis();
        boolean swapped = true;
        int begin = 0;
        int end = list.size();

        while (swapped)
        {
            swapped = false;
            for (int i = begin; i < end - 1; i++)
            {
                if (list.get(i).compareTo(list.get(i + 1)) < 0)
                {
                    Shape temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }

            }

            if (!swapped)
            {
                break;
            }

            swapped = false;

            for (int i = end - 2; i >= begin; i--)
            {
                if (list.get(i).compareTo(list.get(i + 1)) < 0)
                {
                    Shape temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }
            begin++;
        }

        stop = System.currentTimeMillis();

        System.out.println("Amount of time to complete Cocktail sort: " + (stop - start) + "ms");
    }

    public static <t, T> void cocktailSort(ArrayList<Shape> list, Comparator<Shape> c)
    {
        start = System.currentTimeMillis();
        boolean swapped = true;
        int begin = 0;
        int end = list.size();

        while (swapped)
        {
            swapped = false;
            for (int i = begin; i < end - 1; i++)
            {
                if (c.compare(list.get(i), list.get(i + 1)) < 0)
                {
                    Shape temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }

            }

            if (!swapped)
            {
                break;
            }

            swapped = false;

            for (int i = end - 2; i >= begin; i--)
            {
                if (c.compare(list.get(i), list.get(i + 1)) < 0)
                {
                    Shape temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }
            begin++;
        }

        stop = System.currentTimeMillis();

        System.out.println("Amount of time to complete Cocktail sort: " + (stop - start) + "ms");
    }

    // Method for merge sort
    private static ArrayList<Shape> mergeComparable(ArrayList<Shape> leftList, ArrayList<Shape> rightList)
    {
        ArrayList<Shape> mergedList = new ArrayList<Shape>();
        int index = 0;

        while (!leftList.isEmpty() && !rightList.isEmpty())
        {
            if (leftList.get(index).compareTo(rightList.get(index)) < 0)
            {
                mergedList.add(rightList.get(index));
                rightList.remove(index);
            } else
            {
                mergedList.add(leftList.get(index));
                leftList.remove(index);
            }

        }

        while (!leftList.isEmpty())
        {
            mergedList.add(leftList.get(index));
            leftList.remove(index);
        }

        while (!rightList.isEmpty())
        {
            mergedList.add(rightList.get(index));
            rightList.remove(index);
        }

        return mergedList;
    }

    // Method for merge sort
    private static ArrayList<Shape> mergeComparator(ArrayList<Shape> leftList, ArrayList<Shape> rightList,
            Comparator<Shape> c)
    {
        ArrayList<Shape> mergedList = new ArrayList<Shape>();
        int index = 0;

        while (!leftList.isEmpty() && !rightList.isEmpty())
        {

            if (c.compare(leftList.get(index), rightList.get(index)) < 0)
            {
                mergedList.add(rightList.get(index));
                rightList.remove(index);
            } else
            {
                mergedList.add(leftList.get(index));
                leftList.remove(index);
            }

        }

        while (!leftList.isEmpty())
        {
            mergedList.add(leftList.get(index));
            leftList.remove(index);
        }

        while (!rightList.isEmpty())
        {
            mergedList.add(rightList.get(index));
            rightList.remove(index);
        }

        return mergedList;
    }

    private static int partitionComparable(ArrayList<Shape> list, int leftIndex, int rightIndex)
    {
        Shape pivot = list.get(leftIndex);
        int p = leftIndex;

        for (int i = leftIndex + 1; i < rightIndex; i++)
        {
            if (list.get(i).compareTo(pivot) > 0)
            {
                Shape temp = list.get(p + 1);
                list.set(p, list.get(i));
                list.set(i, temp);
                list.set(p + 1, pivot);
                p++;
            }
        }
        return p;
    }
    
    private static int partitionComparator(ArrayList<Shape> list, int leftIndex, int rightIndex, Comparator<Shape> c)
    {
        Shape pivot = list.get(leftIndex);
        int p = leftIndex;

        for (int i = leftIndex + 1; i < rightIndex; i++)
        {
            if (c.compare(list.get(i), pivot) > 0)
            {
                Shape temp = list.get(p + 1);
                list.set(p, list.get(i));
                list.set(i, temp);
                list.set(p + 1, pivot);
                p++;
            }
        }
        return p;
    }

}
