package arrays;

import java.sql.SQLOutput;

public class SubarryLessOrEqual {
    public static void main(String[] args) {
        int [] num = {1, 11, 2,3, 15};
        int N = num.length;
        int B = 10;
        SumEqual(num, N, B);
    }
    static void SumEqual(int [] num, int N, int B){
        int count = 0;
        for(int s = 0; s < N; s++) {
            int sum = 0;
            for (int i = s; i < N; i++) {
                sum += num[i];
                if(sum < B){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
