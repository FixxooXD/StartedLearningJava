import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
while (true){
    System.out.print("enter the number to get the factorial: ");
            int num = in.nextInt();

            int ans = factorial(num);
        System.out.println(ans);
        if (num ==0 || num==0){
        break;
        }
}}
    static int factorial(int n) {
        int sum = 1;
        int i;
        for (i = 1; i <= n; i++) {
            sum =sum * i;
        }
        return sum;
    }
}
