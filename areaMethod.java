
import java.util.Scanner;

public class areaMethod {
    public static void main(String[] args) {
        //Area of Circle
        Scanner in = new Scanner(System.in);
       // int height = in.nextInt();
     //  int base = in.nextInt();
       /* double ans =arrCircle(input);*/ // radius is input
       // int ans = arrTrangle(height,base);
      //  System.out.println(ans);
       arrTrangle(15,2);
    }
    //area of triangle
    static float arrTrangle(int  h, int b) {
        float area = 0;
        area = (float) (0.5 * b * h);
        System.out.println(area);
        return area;
    }
    }


    //area of circle
   /* static double arrCircle(int n){
        double a = 3.14 *n*n;
        return a;

    */




