package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray2 {
        public static void main(String[] args) {
            int[] A = {1,2,3,4,5,6,7,8,9};
            int Si = 1;
            int Sj = 3;
            int[] ans = reverse(A, Si, Sj);
            System.out.println(Arrays.toString(ans)); // arguments
        }
        public static int[] reverse(int [] nums, int Si, int Sj) {
            int Start = Si;
            int End = Sj;
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
