
import java.util.Arrays;
import  java.util.Scanner;
class array{
    public static void main(String[] args) {
        int[] arr= new int[3];
      // System.out.println(arr);
        Scanner in= new Scanner(System.in);

        for (int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
            //System.out.print(arr[i]+" " );
        }
        System.out.println(Arrays.toString(arr));
    }
}