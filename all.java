public class all {
    public static void main(String[]args){
        int a = 10/3;
        //but if type cast 
        double A = (double)10/(double)3;
        //then we will get the output in decimal
        //System.out.println(A);
        int x = 1;
        //int y = x++; //post increment y will be 1 (coz first it's assigning the value then increament)
        //int y = ++x; //pre increment y will be 2 (coz first it's increasing the value and then assigning)
        //System.out.println(y); 

        //x =x+2;
        //OR
        //we can use "compound assignment"  operator 
        //we can also have *= , /= , -=
        x+=2;
        System.out.println(x);

        String n = "12";
        String N = "4.5";
        double X = Double.parseDouble( N+2);
        int y = Integer.parseInt(n+1);
        //System.out.println(y);
        System.out.println(X);


    }
}
