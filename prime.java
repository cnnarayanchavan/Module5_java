//the number which has exact tow factors ("PRIME NUMBER")
// one and the number itself
import java.util.Scanner;
public class prime{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();
     int count =0;
    for(int i=1;  i<=num;  i++){
      if(num%i==0){
        count++;
      }
    }
    if(count==2){
        System.out.println("Prime number");
      }
      else System.out.println("Not prime number");
      
  }
}
