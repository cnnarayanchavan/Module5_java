import java.util.Arrays;
import java.util.Scanner;
public class linerSearchDSA {
    public static void main(String[]args){
        int[] Array1 = {12,23,34,45,56,67};
        System.out.println("Heres the Array, You can select the elemet, which you  want to find index of.");
        System.out.println(Arrays.toString(Array1));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Element from array : ");
        int numFromArr = scanner.nextInt();
        //using linear search algorithm 
        for(int i = 0; i<Array1.length; i++){
            if(Array1[i]==numFromArr){
                System.out.print("Element found at index : " +i);
            }
        }
    }

}
