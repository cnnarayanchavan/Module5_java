import java.util.Arrays;
public class selectionSortDSA{
  public static void main(String[]args){
  int[]Arr1 = {5,4,6,7,9,2};
  // int ans = findMax(Arr1);
  // System.out.println(ans);
    int max = 0;
    int end = Arr1.length-1;
    int temp;
    for(int i = 0; i<arr.length-1; i++){
      if(max<arr[i]){
        max = i;
        temp = max;
        max = end;
        end = temp;
      }
    }
    System.out.println(Arrays.toString(Arr1));
  }
  // public static int findMax(int[] arr){
  //   int max = 0;
  //   for(int i = 0; i<arr.length; i++){
  //     if(max<arr[i]){
  //       max = arr[i];
  //     }
  //   }
  //    return max;
  // }
  // public static void swapElement(){
  //   for(int i = 0; i<arr.length-i-1; i++){
      
  //   }
  // }
}

