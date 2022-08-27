import java.util.Arrays;
import java.util.Scanner;

class twoDarray {
     public static void main(String[] args) {
      int arr[][]=new int[3][3];
         // System.out.println(arr);
         Scanner in= new Scanner(System.in);

//         int arr[][]={
//                 {1,4,4,6},
//                 {5,7,8},
//                 {2,6,7,9,4}
//         };

         //input
         for (int row=0;row<arr.length;row++){
             for(int col=0;col<arr[row].length;col++){
                 arr[row][col]= in.nextInt();
             }
         }

         //output normal
//         for (int row=0;row<arr.length;row++){
//             for(int col=0; col<arr[row].length; col++){
//                 System.out.print(arr[row][col]+" ");
//             }
//             System.out.println();
//         }

         //to  string method
//         for(int row=0;row<arr.length;row++) {
//             System.out.println(Arrays.toString(arr[row]));
//         }
//         enhanced for loop
             for (int[] a : arr){
                 System.out.println(Arrays.toString(a));
             }
     }

}


