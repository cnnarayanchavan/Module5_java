public class bubbleSortTech_DSA {
  public static void main(String[]args){
    int[] array = {5,4,6,88,9,7,90,5,};
    System.out.println(bubbleSort(array));
  }
  static int bubbleSort(int[] arr){
    for(int i = 0; i<arr.length; i++){
      for(int j = 1; j<arr.length-1; j++){  // here with every iteration the last element in array will be sorted so no need to go on that index 
        if(arr[j]<arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
    return -1; //if we don't pass the array.
  }
}
