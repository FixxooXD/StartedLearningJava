
import java.util.Scanner;
public class assingments {
    public static void main(String[] args) {
        //Input a year and find whether it is a leap year or not
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        if (A % 4 == 0) {
            System.out.println("It is a leap year!!");
        }
           else{
                System.out.println("It  is not a leap year sed!!");
            }

    }
}
