

import java.util.Scanner;
 public class isPrime {

     public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while (true) {


                int num = in.nextInt();
                boolean ans = prime(num);
                System.out.println(ans);
                if(ans == false){
                    break;
                }
            }

        }
        static boolean prime(int n) {

            if (n <= 1) {
                return false;
            }
            int c = 2;
            while (c * c <= n) {
                if (n % c == 0) {
                    return false;
                }
                c++;
            }
            if (c*c > n) {
                return true;
            }return false;
        }
}
