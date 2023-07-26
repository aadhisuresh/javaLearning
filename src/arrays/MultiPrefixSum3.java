package arrays;

import java.util.Arrays;

public class MultiPrefixSum3 {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int N = A.length;
        int [] Ans = productArray(A, N);
        System.out.println(Arrays.toString(Ans));
    }

    static int[] productArray(int[] A, int N) {
        int[] prefixProduct = new int[N];
        prefixProduct[0] = A[0];
        for (int i = 1; i < N;i++) {
            prefixProduct[i] = prefixProduct[i - 1] * A[i];
        }

        int[] suffixProduct = new int[N];
        suffixProduct[N-1] = A[N-1];
        for (int i = N-2; i >= 0; i--) {
            suffixProduct[i] = suffixProduct[i + 1] * A[i];
        }
        int [] answer = new int[N];
        for(int i=0; i<N; i++) {
            if(i == 0) answer[i] = suffixProduct[i+1];
            else if(i == N-1) answer[i] = prefixProduct[i-1];
            else answer[i] = prefixProduct[i-1]*suffixProduct[i+1];
        }
        return answer;
    }

}
