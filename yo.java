import java.util.Arrays;
import java.util.Scanner;
class arrayproblems {
    public static void main(String[] args){
        Scanner take_input= new Scanner(System.in);
          int[] arr = {1, 4, 8, 0};
       System.out.println(Arrays.toString(arr));
//        to Swap to numbers through index
//       swap(arr,0,3);
       // System.out.println(Arrays.toString(arr));
//        System.out.println(max(arr));
//        System.out.println(maxRange(arr,0,3));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }





    static void reverse(int[] arr){
     int  start =0;
     int  end = arr.length-1;
     while(start<end){
     swap(arr,  start,end);
     start ++;
     end --;

    }
}
    static int max(int[] arr){
        int max= arr[0];
        for (int i=1; i < arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }return max;
    }

    static int maxRange(int[] arr,int start,int end ){
        int max= arr[start];
        for (int i=arr[start]; i < arr[end];i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }return max;
    }
    static void swap(int[] arr, int index1, int index2){
         int temp =  arr[index2];
        arr[index2] = arr[index1];
         arr[index1] = temp;

    }
}

