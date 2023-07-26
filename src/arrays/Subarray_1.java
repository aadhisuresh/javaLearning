package arrays;

import java.util.Arrays;

public class Subarray_1 {
    public static void main(String[] args) {
        int [] A = {0,1,2,3,4,5,6,7,8};
        int N = A.length;
        printsubarray(A);
    }
    static void printsubarray(int [] A){
        int s =0;
        int e =8;
        for(int i = s; i <= e; i++){
            System.out.print(A[i] + " ");
        }
    }
}
