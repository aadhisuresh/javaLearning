package arrays;

public class SubarrayPrint {
    public static void main(String[] args) {
        int [] A = {2,8,9};
        int N = A.length;
        SubarrayPrint(A, N);
    }
    static void SubarrayPrint(int [] A, int N){
        for(int S = 0; S < N; S++){
            for(int E = S; E < N;E++){
                printSum(A, S, E);
            }
        }
    }
    static void printSum(int [] A, int  S, int E){
        int Sum = 0;
        for(int i = S; i <= E; i++){
            //System.out.print(A[i] + " ");
            Sum = Sum + A[i];
        }
        System.out.println(Sum);
        System.out.println();
    }
}
