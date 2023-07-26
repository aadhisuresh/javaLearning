package Hashmap;

import java.util.HashMap;

public class Hashmap_RepeatingNumbers {
    static HashMap<Integer, Integer> rep = new HashMap<>();
    public static void main(String[] args) {
        int A[] = {2, 5 ,3 ,4, 3, 5, 2, 6};
        int N = A.length;
        System.out.println(Repeat(A , N));
    }

    static int Repeat(int[] A, int N) {

        for(int i = 0; i < N ;i++){
            if(rep.containsKey(A[i])){
                rep.put(A[i], rep.get(A[i])+1);
            } else {
                rep.put(A[i], 1);
            }
        }
        for(int i=0; i<N; i++) {
            if(rep.containsKey(A[i])) {
                if(rep.get(A[i]) > 1) {
                    return A[i];
                }
            }
        }
        return -1;
    }
}
