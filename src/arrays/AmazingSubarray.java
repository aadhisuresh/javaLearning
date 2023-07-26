package arrays;

public class AmazingSubarray {
    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 5};
        int N = A.length;
        int B = 4;
        SumEqual(A, N, B);
    }
    static void SumEqual(int [] num, int N, int B){
        int count = 0;
        int [] PS = new int[N];
        PS[0] = num[0];
        for(int i = 1; i<N; i++){
            PS[i] = PS[i - 1] + num[i];
        }
        for(int s = 0; s < N; s++) {
            int sum = 0;
            int length = 0;
            for (int e = s; e < N; e++) {
                length++;
                if(s == 0) {
                    sum = PS[e];
                } else {
                    sum = PS[e] - PS[s - 1];
                }
                if(length%2 == 0 && sum < B) {
                    count++;
                }
                else if(length%2 != 0 && sum > B) {
                    count++;
                }
            }
        }
        System.out.println("Total: " + count);
        }
    }


