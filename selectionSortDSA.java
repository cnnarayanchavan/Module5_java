import java.util.Arrays;
public class selectionSortDSA{
<<<<<<< HEAD
  public static void main(String[]args){
    int[] arr = {9,8,7,6,5};
    for(int i = 0; i<arr.length; i++){
    int max = 0;
    int end = arr.length - i - 1;
    if(arr[max]<arr[i]){
        max = i;
      }
    for(int j = 0; j<=end; j++){
    int temp = arr[max];
    arr[max] = arr[end];
    arr[end] = temp;
      }
=======
  public static void main(String[] args)
    {
        int[] arr = {4,3,6,9,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
>>>>>>> dbf83e8b288c59e636a7823241448928415cb8ad
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



