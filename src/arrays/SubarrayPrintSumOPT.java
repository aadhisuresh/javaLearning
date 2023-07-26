package arrays;

public class SubarrayPrintSumOPT {
    public static void main(String[] args) {
        int [] A = {1,2,3};
        int N = A.length;
        System.out.println(SubarrayPrint(A, N));
    }
    static int SubarrayPrint(int [] A, int N) {
        int sum = 0;
        for(int i = 0; i < N; i++){
            int x = i + 1;
            int y = N -  i;
            sum += x * y * A[i];

        }
        return sum;
    }
}
