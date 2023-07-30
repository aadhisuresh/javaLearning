package Hashmap;

import java.util.HashMap;

public class CountPairsDifference_TwoSum {
    public static int solve(int[] A, int K, int N) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count  = 0;

        for(int i=0; i<N; i++) {
            int a = A[i] - K;
            int b = K + A[i];

            if(map.containsKey(a)) {
                count += map.get(a);
            }
            if(map.containsKey(b)) {
                count += map.get(b);
            }
            if(map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i])+1);
            }
            else {
                map.put(A[i],1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = new int[] {1,2,1,2};
        int K = 1;
        int N = A.length;

        System.out.println("The number of pairs are " + solve(A,K,N));
    }
}
