import java.util.Arrays;

public class selectionSortDSA{
  public static void main(String[]args){
    int[] arr = {4,5,6,7,12};
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if(arr[max] < arr[j]){
          max = arr[j];
        }
        int temp = arr[max];
        arr[max] = arr[i];
        arr[i] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}



