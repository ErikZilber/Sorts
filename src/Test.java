public class Test
{
    public static void main(String[] args)
    {
        int[] arr1 = buildArray(100000);
        int[] arr2 = arr1.clone();

        long start1 = System.currentTimeMillis();
        Sorts.ascendingSort(arr1);
        long end1 = System.currentTimeMillis();
        long selectionTime1 = end1 - start1;
        System.out.println("Selection sort on unsorted data: " + selectionTime1);

        long start2 = System.currentTimeMillis();
        Sorts.ascendingSort(arr1);
        long end2 = System.currentTimeMillis();
        long selectionTime2 = end2 - start2;
        System.out.println("Selection sort on sorted data: " + selectionTime2);

        long start3 = System.currentTimeMillis();
        Sorts.insertionSort(arr2);
        long end3 = System.currentTimeMillis();
        long selectionTime3 = end3 - start3;
        System.out.println("Insertion sort on unsorted data: " + selectionTime3);

        long start4 = System.currentTimeMillis();
        Sorts.insertionSort(arr2);
        long end4 = System.currentTimeMillis();
        long selectionTime4 = end4 - start4;
        System.out.println("Insertion sort on sorted data: " + selectionTime4);
    }
    public static int[] buildArray(int size)
    {
        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
            arr[i] = randomNumberGenerator(size);
        return arr;
    }
    public static int randomNumberGenerator(int max)
    {
        return (int) (Math.random() * max);
    }
}
