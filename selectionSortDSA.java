import java.util.Arrays;
public class selectionSortDSA{
  public static void main(String[] args)
    {
        int[] arr = {4,3,6,9,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length-i-1;
            int findMax = findMaxElement(arr, 0, end);
            swapElement(arr,findMax,end);
        }
    }
    public static int findMaxElement(int[]array, int start , int end)
    {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(array[max]<array[i]){
                max = i;
            }
        }
        return max ;
    }

    public static void swapElement(int[] arr, int first, int second)
  {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
  }

}



