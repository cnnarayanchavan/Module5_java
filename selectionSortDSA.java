import java.util.Arrays;
public class selectionSortDSA{
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
    }
    System.out.println(Arrays.toString(arr));
  }
}



