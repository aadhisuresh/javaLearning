package arrays;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] A = {-3,6,2,4,5,2,8,-9,3,1};
        int N = A.length;
        int[] ans = sum(A, N);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sum(int [] nums, int N) {
        int [] PS = new int[N];
        PS[0] = nums[0];
        for (int i = 1; i < N;i++)
            PS[i] = PS[i - 1] + nums[i];
        return PS;
    }
}
