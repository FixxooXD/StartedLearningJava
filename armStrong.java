import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isArmstrong(153));

    }

   static boolean isArmstrong(int n) {
       int original = n;
       int sum = 0;

       while (n > 0) {
           int rem = n % 10;
           n = n / 10;
           sum = sum + rem*rem*rem;
       }

       return sum == original;
   }
}