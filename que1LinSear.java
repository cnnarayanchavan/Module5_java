import java.util.Arrays;
public class que1LinSear{
  public static void main(String[]args){
  int[] Array1 = {12,15,161,202,149};
  for(int i = 0; i<Array1.length; i++){
      String int_to_str = Integer.toString(Array1[i]);
      if(int_to_str.length()%2==0){
        System.out.print(Array1[i] + " ");
      }
  }
  }
}
