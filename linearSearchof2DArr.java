
import java.util.Scanner;
public class linearSearchof2DArr {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int rows = 4;
    int cols = 3;        //array is of 4x3
    int[][] arr = new int[rows][cols];
    System.out.println("Enter elements for array");
    //nested loop for taking input from user
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.println("Enter element from array that u want to find index of : ");
    int element  = sc.nextInt();
    //nested loop for printing the array
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[i][j] + " ");
            if (element==arr[i][j]) {
                System.out.print("Element found at index : "+"["+i + ","+j+"]" );
            }
        }
        System.out.println();
    }
    }
}
