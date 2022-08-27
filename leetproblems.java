import java.util.Arrays;

public class leetproblems {
    public static void main(String[] args) { //[[1,2,3],[3,2,1]]
        int[] nums = {2,3,5,1,3};
        boolean[] result = new boolean[nums.length];
        //boolean[] result =new boolean[nums.length];
          candies(nums,3);
        System.out.println(Arrays.toString(result));



    }
    static void candies(int[] nums, int  n) {
        boolean[] result = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + n < nums[i]+i) {
                 result[i] = true;
            }
            else {
                result[i] = true;
            }
        }

    }
}































//        shuffle(nums,2);
//        System.out.println(Arrays.toString(shuffle(nums,4)));
//
//    }static int[] shuffle(int[] arr, int n){
//        int[] answer = new int[n*2];
//
//        for(int i=0; i<n; i++){
//
//            answer[2*i] = arr[i];           //2*i Even Number
//            answer[ (2*i+1) ] = arr[n+i];  // 2*i+1 Odd Number
//        }
//return answer;
//
//    }
//
//}

















//        }
       // System.out.println(arr[0][0]);
//        int[] nums = {1, 2, 3, 4};        //[1,3,6,10]
//        int[] ans = new int[nums.length];
//        System.out.println(Arrays.toString(nums));
//        int sum = nums[0];
//        ans[0] = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            sum += nums[i];
//            ans[i] = sum;
//
//        }
//
//    System.out.println(Arrays.toString(ans));
//




            //sum[i]=nums[i]+nums[i];
//            for(int j=i; j<nums.length; j++){
//                ans[i] =nums[j];
//            }



//
//       [[Question Concatenation of Array]]

//                int[] ans = new int[nums.length * 2];
//
//                for(int i=0;i<nums.length;i++) {
//                    ans[i] = nums[i];
//                }System.out.println(Arrays.toString(ans));
//
//        for(int i=0;i<nums.length;i++) {
//            int indes = nums.length;
//           // ans[nums.length] = nums[i];
//                for (int j=0;j< nums.length;j++ ){
////                    int indes = nums.length;
//                    ans[indes] = nums[j];
//                    indes++
//        System.out.println(Arrays.toString(ans));
//



