package arrays;

import java.util.Arrays;

public class PSMaxsimum {
    public static void main(String[] args) {
        int[] A = {-3,6,2,4,5,2,8,-9,3,1};
        int N = A.length;
        int[] ans = maximum(A, N);
        System.out.println(Arrays.toString(ans));
    }
    static int[] maximum(int [] nums, int N) {
        int [] PS = new int[N];
        PS[N-1] = nums[N-1];
        for (int i = N-2; i >= 0;i--)
            PS[i] = Math.max(PS[i + 1] , nums[i]);
        return PS;
    }
}
