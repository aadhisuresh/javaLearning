package arrays;

public class SubarrayPrintOpt {
    public static void main(String[] args) {
        int [] A = {2,8,9};
        int N = A.length;
        SubarrayPrint(A, N);
    }
    static void SubarrayPrint(int [] A, int N) {
        /*int[] PS = new int[N];
        PS[0] = A[0];
        for(int i = 1; i < N; i++){
            PS[i] = PS[i-1] + A[i];
        }*/
        for(int S = 0; S <  N; S++){
            int Sum = 0;
            for(int i = S; i< N;i++){
                Sum += A[i];
                System.out.println(Sum);
            }
        }
    }
//    static void printSum(int [] A, int  S, int E){
//        int Sum = 0;
//        for(int i = S; i <= E; i++){
//            //System.out.print(A[i] + " ");
//            Sum = Sum + A[i];
//        }
//            System.out.println(Sum);
//            System.out.println();
//    }

}
