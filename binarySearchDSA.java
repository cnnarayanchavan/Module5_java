public class binarySearchDSA{
  public static void main(String[]args){
    int[] arr = {2,8,16,18,19,20,22,25};
    int Target = 16;  
    System.out.Println(binarySer(arr,Target));
  }
  
  static int binarySer(int[] Array, int targetEle){
    int startInd = 0;
    int endInd = Array.length-1; 
    while(startInd<=endInd){
      int midInd = startInd+(endInd-startInd)/2;
      if(targetEle > Array[midInd]){
        startInd = midInd + 1; 
      }
      else if(targetEle < Array[midInd]){
        startInd = midInd - 1;
      }
      else{
        return midInd;
      }
      return "Element not found, enter valid element"
    }
  }
}

  
