package arrays;

public class SubarraywithSumK {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int N = A.length;
        int K = 20;
        SubarraySumWithK_CarryForward(A, N, K);
        SumSubarryBruteForce(A, N, K);
    }

    //this method uses carry forward approach. Time Complexity --> O(N^2)
    static void SubarraySumWithK_CarryForward(int [] A, int N, int K){
        int count  = 0;
        for(int s = 0; s < N; s++){
            int Sum = 0;
            for(int i = s; i < N; i++){
                Sum += A[i];
                if(Sum == K) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    //this method explains the solution using Brute Force. Time Complexity --> O(N^3)
    static void SumSubarryBruteForce(int [] A, int N,int K){
    int count = 0;
        for(int s = 0; s <N; s++){
            for(int e = 0; e < N; e++) {
                int sum = 0;
               for(int i=s; i<=e; i++) {
                   sum += A[i];
               }
               if(sum == K) {
                   count++;
               }
            }
        }
        System.out.println(count);
    }
}
