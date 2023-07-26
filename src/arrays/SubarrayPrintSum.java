package arrays;

public class SubarrayPrintSum {
    public static void main(String[] args) {
        int [] A = {1,2,3};
        int N = A.length;
        SubarrayPrint(A, N);
    }
    static void SubarrayPrint(int [] A, int N) {
      int result = 0;
      for(int s = 0; s < N; s++){
          int sum = 0;
          for(int i = s; i < N; i++){
              sum += A[i];
              result += sum;
          }
      }
      System.out.println(result);
    }
}
