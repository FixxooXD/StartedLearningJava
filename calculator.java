import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
//IFINITE LOOP UNTIL WE ENTER 'X' TO TERMINATE
        while(true) {
            System.out.println("Enter an Operation: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '/' || op == '*') {
                        System.out.print("enter the first number: ");
                        int num1 = in.nextInt();
                        System.out.print("enter the second number: ");
                        int num2 = in.nextInt();


                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
            } else if (op == 'x' || op == 'X') {
                System.out.println("Terminated");
                break;
            } else {
                System.out.println("invalid operation");
            }

            System.out.println(ans);
        }

        }
    }

