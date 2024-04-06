public class selectionSortDSA{
  public static void main(String[]args){
  int[]Arr1 = {5,4,6,7,9,2};
  int ans = findMax(Arr1);
    System.out.println(ans);
  }
  public static int findMax(int[] arr){
    for(i = 0; i<arr.length; i++){
      int max = 0;
      if(max<arr[i]){
        max = arr[i];
        return max;
      }
    }
  }
}

