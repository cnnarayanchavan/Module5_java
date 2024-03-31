import java.util.Arrays;
import java.util.Scanner;
public class que2LinSear {
    public static void main(String[] args) {
        int[][] myArr = {
            {9,9,9},
            {3,2,1},
            {4,4,4},
        };       
        int ans = maxWealth(myArr);
        System.out.println("The wealthof the richest person is : " + ans);
    }

    public static int maxWealth(int[][]arr1){
        //loop for itreating through 2d array
        int max =0;
        //1st loop for rows
        for (int i = 0; i < arr1.length; i++) {
            int sum =0;
            // int max =0;
            //2nd for columns
            for (int j = 0; j < arr1.length; j++) {
                sum=sum+arr1[i][j];
            }
            if(max<sum){
                max = sum;
            } 
        }
        return max;
    }
}

//LeetCode second:     Richest customer wealth question 2D array with liner search 




































//2D array hardcoded

// public static void main(String[]args){
//     int[][] array = {
//         {1,2,3},
//         {5,6,7},
//         {9,8,7},
//         {2,3,4}
//     };
//     //System.out.println(array[1][0]);
//     for (int i = 0; i < array.length; i++) {
//         for (int j = 0; j < array.length-1; j++) {
//             System.out.print(array[i][j] + " ");
//         }
//         System.out.println();
//     }
// }









//Array 2D as input from user 


// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number of row you wnat : ");
//     int row = sc.nextInt();
//     System.out.print("Enter the number of col you wnat : ");
//     int col = sc.nextInt();
//     int[][]myArr=new int[row][col];


//     //loop for taking user input
//     for (int i = 0; i < row; i++) {
//         for (int j = 0; j < col; j++) {
//             myArr[i][j]=sc.nextInt();
//         }
//     }

//     //loop for printing values 
//     for (int i = 0; i < row ; i++) {
//         for (int j = 0; j < col; j++) {
//             System.out.print(myArr[i][j] + " ");
//         }
//         System.out.println();
//     }
// }
