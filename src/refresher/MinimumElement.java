package refresher;

public class MinimumElement {
    public static void main(String[] args) {
        int Min[] = {-1,-2,-3,-4,-5,-6,-7};
        int Ans = Integer.MAX_VALUE;
        MinimumElement obj = new MinimumElement();
        obj.Minimum(Min,Ans);
        obj.Minimum1(Min,Ans);
    }
    public int Minimum( int[] Min, int Ans){
        for(int i = 0; i<Min.length; i++){
            if(Ans > Min[i] ){
                Ans = Min[i] ;
            }
        }
        System.out.println(Ans);
        return Ans;
    }
    public void Minimum1( int[] Min, int Ans){
        for(int i = 0; i<Min.length; i++){
            if(Ans > Min[i] ){
                Ans = Min[i] ;
            }
        }
        System.out.println(Ans);
    }
}
