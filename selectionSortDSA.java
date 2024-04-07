import java.util.Arrays;
public class selectionSortDSA{
  public static void main(String[]args){
    int[] arr = {7,4,9,2,10};
    for(int i = 0; i<arr.length-1; i++){
      int max = 0;
      int end = arr.length-i-1;
      for(int j = 0; j<=end; j++){
      if(max<arr[j]){
        max = i;
      }
      int temp = arr[max];
      arr[max] = arr[end];
      arr[end] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}



