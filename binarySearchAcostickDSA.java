//when you dont know the array is sorted or not (either in asending or decending order)
public class binarySearchAcostickDSA{
  public static void main(String[]args){
    int[] arr = {4,4,4,5,6,7,3,3,3,22,44};
    int target = 22;
      
  }
  static boolean binaryAcos(int[] array , int element){
    int s = 0 ;
    int e = array.length-1;
    if(s<e){
      boolean isAce = true;
    }
    else{
      boolean isDesc = false;
    }

    while(s<=e){
      int m = s+(e-s)/2;
      if(isAce = true){
        if(element > element[m]){
          s = m+1;
        }else {  
          e = m-1;
        }
      }
      else{
        if(element > array[m]){
          e=m-1;
        }
        else{
          s=m+1
        }
      }
    }
  }
}
