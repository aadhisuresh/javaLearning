package arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] ans = reverse(A);
        System.out.println(Arrays.toString(ans)); // arguments
    }
    public static int[] reverse(int [] nums) {
        int Start = 0;
        int End = nums.length-1;
       while (Start < End){
           int x = nums[Start];
           nums[Start] = nums[End];
           nums[End] = x;
           Start++;
           End--;
       }
       return nums;
    }

}
