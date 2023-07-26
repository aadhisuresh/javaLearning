package arrays;

public class SubarrayLessOPT {
    public static void main(String[] args) {
        int [] num = {1, 11, 2,3, 15};
        int N = num.length;
        int B = 10;
        SumEqual(num, N, B);
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
            for (int e = s; e < N; e++) {
                if(s == 0) {
                    sum = PS[e];
                } else {
                    sum = PS[e] - PS[s - 1];
                }
                if(sum < B) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
