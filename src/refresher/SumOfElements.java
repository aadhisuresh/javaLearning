package refresher;

public class SumOfElements {
    public static void main(String[] args) {
        int Num[] = {1,2,3,4,5,6};
        int Sum = 0;
        int i = 0;
        SumOfElements obj = new SumOfElements();
        obj.Sum(Num, Sum, i);
        obj.Sum1(Num, Sum, i);
}
    public int Sum(int [] Num, int Sum, int i){
        for(i = 0; i < Num.length; i++){
            Sum += Num[i];
        }
        System.out.println(Sum);
        return Sum;
    }
    public void Sum1(int [] Num, int Sum, int i){
        for(i = 0; i < Num.length; i++){
            Sum += Num[i];
        }
        System.out.println(Sum);
    }
}
