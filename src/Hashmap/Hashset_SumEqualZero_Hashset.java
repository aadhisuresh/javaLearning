package Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class Hashset_SumEqualZero_Hashset {
    public static void main(String[] args) {
        int[] A = {1, -1, 3, 4, 5};
        int N = A.length;
        System.out.println(EqualZero(A, N));
    }

    static int EqualZero(int[] A, int N) {
        int [] PS = new int[N];
        PS[0] = A[0];
        for(int i=1; i<N;i++){
            PS[i] = PS[i-1] + A[i];
        }
        HashSet<Integer> Set = new HashSet<>();

        for(int i =0; i<N;i++){
            if(A[i]==0){
                return 1;
            }
            if(PS[i]==0){
                return 1;
            }
            if(Set.contains(PS[i])){
                return 1;
            } else {
                Set.add(PS[i]);
            }
        }
        return 0;
    }
}
