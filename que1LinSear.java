import java.util.Arrays;
public class que1LinSear{
  public static void main(String[]args){
    int count = 0;
  int[] Array1 = {12,15,161,202,149};
  for(int i = 0; i<Array1.length; i++){
      String int_to_str = Integer.toString(Array1[i]);
      if(int_to_str.length()%2==0){
        count = count+1;
      }
    }
    System.out.println("Total number with even digits in the array are : " +count);    
  }
}

//PROBLEM STATEMENT
//GIVEN AN ARRAY NUMBER OF INTEGER, RETURN HOW MANY OF THEM CONTAIN EVEN NUMBER OF DIGITS
