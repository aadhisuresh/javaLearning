package refresher;

public class Balance {
    public static void main(String[] args) {
        int Num[] = {2, 3, 4, 5, 6, 7, 8, 1};
        int N = Num.length;
        Balance obj = new Balance();
        int ans =  obj.BalancingElement(Num, N);
        System.out.println(ans);
    }
    public int BalancingElement(int[] Num, int N){
        int i;
        int sum1 = 0;
            for(i = 0; i < N/2; i++){
                sum1 += Num[i];
            }
            int sum2 = 0;
            for(i = N/2; i < N; i++){
                sum2 += Num[i];
            }
            if (sum1 > sum2){
                return sum1 - sum2;
            }else{
                return sum2 - sum1;
            }
    }

}
