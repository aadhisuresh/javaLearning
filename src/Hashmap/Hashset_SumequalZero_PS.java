package Hashmap;

import java.util.Arrays;

public class Hashset_SumequalZero_PS {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int N = A.length;
        System.out.println(EqualZero(A, N));
    }

    static int EqualZero(int[] A, int N) {
        for(int s = 0; s < N; s++){
            int Sum = 0;
            for(int i = s; i < N; i++){
                Sum += A[i];
                if(Sum == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
