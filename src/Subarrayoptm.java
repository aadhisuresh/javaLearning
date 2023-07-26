public class Subarrayoptm {
    static int Subarray(int [] A, int N) {
        int min = Min(A,N);//Max
        int max = Max(A,N);//Min
        int lastmaxIndex = -1;
        int lastminIndex = -1;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++){
            if(A[i] == max){
                lastmaxIndex = i;
            }
            if(A[i] == min){
                lastminIndex = i;
            }
            if(lastminIndex != -1 && lastmaxIndex != -1){
                int length = Math.abs(lastminIndex-lastmaxIndex)+1;
                if(length < ans){
                    ans = length;
                }
            }
        }
        return ans;
    }
    static int Min(int []A, int N){
        int min = A[0];
        for(int i = 1; i<N;i++){
            if(A[i]<min){
                min = A[i];
            }
        }
        return min;
    }
    static int Max(int []A, int N){
        int max = A[0];
        for(int i = 1; i<N;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,1,3,4,6,4,6,3};
        int N = A.length;
        System.out.println(Max(A,N));
        System.out.println(Min(A,N));
        System.out.println(Subarray(A, N));
    }
}
