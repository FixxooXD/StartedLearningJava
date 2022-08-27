import java.util.Scanner;

public class methods {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(sum(a,b));
    }
        static int sum(int a, int b){
            int summ = a;
            a = b ;
            b= summ;
            return  summ ;
        }

}

