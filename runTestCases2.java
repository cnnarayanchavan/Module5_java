public class runTestCases2{
    public static void main(String[] args) {
    // int a=10;
    // int b=100;
    // if(a/b==0){
    //     System.out.println("Blah");
    // }
    // else if (b*a == 1000) {
    //     System.out.println("blahhhhh");
    // }
    // else
    // {
    //     System.out.println(a+b);
    // }

    int[] arr = {4,3,5,9,56,7};
    int max = 0 ;
    for (int i = 0; i < arr.length; i++) {
        if (max<arr[i]) {
            max = i;
        }
    }
    System.out.println(max);
    }
}