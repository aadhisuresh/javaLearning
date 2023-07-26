package arrays;

public class BalancingElement {
    public static void main(String[] args) {
        int[] num = {1,3,4,5,6,7};
        int N = num.length;
        System.out.println("Balancing Element :-");
        System.out.println(Balance(num, N));
    }
    static int Balance(int [] num, int N){
        int Sum1 = 0;
        for(int i = 0; i < N/2; i++){
            Sum1 += num[i];
        }
        int Ans1 = Sum1;

        int Sum2 = 0;
        for(int i = N/2; i < N; i++){
            Sum2 += num[i];
        }
        int Ans2 = Sum2;

        if(Ans1 > Ans2){
            return Ans1 - Ans2;
        } else {
            return Ans2 - Ans1;
        }
    }
}
