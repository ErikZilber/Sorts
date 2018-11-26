import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
        int[] arr = {5,3,1,67,2,12,12,24,11,12,89,987,2334,1};
        Sorts.printArr(arr);
        Sorts.ascendingSort(arr);
        Sorts.printArr(arr);
        String[] Arr = {"Andrew","Xinyi","Isiah","Richard","Andrew","Asllan","Jie","Jamil","Samuel","Alan"};
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < Arr.length; i++)
        {
            list.add(Arr[i]);
        }
        Sorts.printArr(Arr);
        Sorts.ascendingSort(Arr);
        Sorts.printArr(Arr);

        System.out.println(list);

        Sorts.ascendingSort(list);
        System.out.println(list);
    }
}
