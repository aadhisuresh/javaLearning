package Hashmap;

import arrays.TwoSum;

import java.util.HashMap;

public class Hashmap_TwoSum {
    static HashMap<Integer, Integer> two = new HashMap<>();
    public static void main(String[] args) {
        int A[] = {-2, -1, 5, 0, 0};
        int N = A.length;
        Hashmap_TwoSum obj = new Hashmap_TwoSum();
        int k = 10;
        System.out.println(obj.Sum(A , k, N));
    }

    static boolean Sum(int[] A, int k, int N) {
        int sum = 0;
        // TC - 0(N)
        // SC - 0(N) - Due to hashmap creation
        for (int i = 0; i < N; i++) {
            int diff = k - A[i];
            if(two.containsKey(diff)){
                return true;
            }
            two.put(A[i],i);
        }
        return false;
    }
}
