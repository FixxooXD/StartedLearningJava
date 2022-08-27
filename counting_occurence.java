import java.util.Scanner;

public class counting_occurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  input  = in.nextInt(); //1237646676647
        System.out.println("Occuring number: ");
        int occuring_number = in.nextInt();
        int count = 0;
        while(input > 0){
          int rem =  input % 10 ;
             if (rem == occuring_number){
                 count++;
             }
             input = input/10;
        }
        System.out.println(count);


    }
}
