package arrays;

import java.util.Arrays;

public class PrefixSum2 {
    public static void main(String[] args) {
        int[] A = {1,-1,1,-1,1};
        int N = A.length;
        System.out.println(Prefix(A, N));
    }
    static boolean Prefix(int [] A, int N) {


        for(int i = 0; i< N;i++) {
            int SL = 0;
            int SR = 0;
            for (int j = 0; j < i; j++) {
                SL += A[j];
            }
            for (int j = i + 1; j < N; j++) {
                SR += A[j];
            }

            if (SR == SL) {
                return true;
            }
        }
        return false;
        }

}
