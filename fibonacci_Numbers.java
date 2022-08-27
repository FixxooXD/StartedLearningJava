
import java.util.Scanner;
public class fibonacci_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Nth Value: ");
        int n = in.nextInt();
        int A = 0;
        int B = 1;
        int count = 2;

        while (count <= n)
        {
            int TEMP = B;
            B = B + A;
            A = TEMP;
            count++;
        }
        System.out.println(B);
    }
}



