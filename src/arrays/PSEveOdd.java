package arrays;

import java.util.Arrays;

public class PSEveOdd {
    public static void main(String[] args) {
        int[] A = {3,2,1,0,4,-1,5};
        int N = A.length;
        int[] ans = Odd(A, N);
        int[] ans2 = even(A, N);
        System.out.println("Odd -" +Arrays.toString(ans));
        System.out.println("Even -" +Arrays.toString(ans2));
    }
    static int[] even(int [] nums, int N) {
        int[] PS = new int[N];
        PS[0] = nums[0];
        for (int i = 1; i < N; i++)
            if(i % 2 ==0) {
                PS[i] = PS[i-1] + nums[i];
            } else {
                PS[i] = PS[i-1];
            }
        return PS;
    }
    static int[] Odd(int [] nums, int N) {
        int[] PS = new int[N];
        PS[0] = nums[0];
        for (int i = 1; i < N; i++)
            if(i % 2 !=0) {
                PS[i] = PS[i-1] + nums[i];
                PS[0] = 0;
            } else {
                PS[i] = PS[i-1];
            }
        return PS;
    }
}
