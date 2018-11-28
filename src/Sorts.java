import java.util.ArrayList;
import java.util.List;

public class Sorts
{
    public static void ascendingSort(int[] arr)
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            int lowPosition = i;
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j] < arr[lowPosition])
                    lowPosition = j;
            }
            swap(i,lowPosition,arr);
        }
    }
    public static void ascendingSort(String[] arr)
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            int lowPosition = i;
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[j].compareTo(arr[lowPosition]) < 0)
                    lowPosition = j;
            }
            swap(i,lowPosition,arr);
        }
    }
    private static void swap(int indexA, int indexB, int[] arr)
    {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
    private static void swap(int indexA, int indexB, String[] arr)
    {
        String temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
    public static void printArr(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void printArr(String[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void ascendingSort(List<String> list)
    {
        for(int i = 0; i < list.size()-1; i++)
        {
            int lowPosition = i;
            for(int j = i+1; j < list.size(); j++)
            {
                if(list.get(j).compareTo(list.get(lowPosition)) < 0)
                    lowPosition = j;
            }
            list.set(i, list.set(lowPosition, list.get(i)));
        }
    }
    public static ArrayList<String> removeLongerThan(int maxLen, List<String> list)
    {
        ArrayList<String> removedList = new ArrayList<String>();
        for(int i = list.size() -1; i >= 0; i --)
        {
            if(list.get(i).length() > maxLen)
                removedList.add(list.remove(i));
        }
        return removedList;
    }
    public static void insertionSort(int[] elements)
    {
        for(int i = 1; i < elements.length; i++)
        {
            int temp = elements[i];
            int possibleIndex = i;
            while(possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
    }
}
