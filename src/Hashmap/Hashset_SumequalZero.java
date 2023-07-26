package Hashmap;

public class Hashset_SumequalZero {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int N = A.length;
        System.out.println(EqualZero(A, N));
    }

    static int EqualZero(int[] A, int N) {
        for (int s = 0; s < N; s++) {
            for (int e = 0; e < N; e++) {
                int sum = 0;
                for (int i = s; i < e; i++) {
                    sum += A[i];
                }
                if (sum == 0) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
