package Hashmap;

import java.util.HashSet;

public class Hashset_RepeatingNumbers {
    public static void main(String[] args) {
        int [] A = {2, 5 ,3 ,4, 3, 5, 2, 6};
        int N = A.length;
        System.out.println(RepeatSet(A,N));
    }
    static int RepeatSet(int []A, int N){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i < N; i++){
            if(set.contains(A[i])){
                return A[i];
            } else {
                set.add(A[i]);
            }
        }
        return -1;
    }
}
