public class binarySearchDSA_Desc{
  public static void main(String[] args){
    int arr[] = {72,68,58,48,38,27,22,18,15,5};
    int target = 18;
    int op = searchInDes(arr,target);
    System.out.println(op);
    
    
  }
  static int searchInDes(int[] arrr,int tar)
  {
    int start = 0;
    int end = arrr.length-1;
    while(start <= end){
      int mid = start+(end-start)/2;
      if(tar < arrr[mid])
      {
        start = mid + 1;
      }
      else if(tar > arrr[mid])
      {
        end = mid - 1;
      }
      else{
        return mid;
      }
      
    }
    return -1;  //if element is not found
  }
}
