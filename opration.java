import java.util.Scanner;

 class operation {
    public static void main(String[] args) {

       int a = 0;
       int b = 1;
       Scanner in = new Scanner(System.in);
       int Input  = in.nextInt();
       int count = 2;

       while(count <=Input){
           int  temp = b;
           b = a+b;
           a = temp;
           count ++;

       }
        System.out.println(b);

       // System.out.println(F * B + ", " + I/C +  ", " + D*S );
     //   System.out.println("HERE IS THE ANSWER: "+(F * B)+ (I/C) + (D*S) );


        //OUTPUT
        // FLOAT * byte = FLOAT;
        // INTEGER / CHARACTER = INTEGER;
        // DOUBLE * SHORT = DOUBLE;

        // FLOAT + INTEGER + DOUBLE  = DOUBLE

    }
}
