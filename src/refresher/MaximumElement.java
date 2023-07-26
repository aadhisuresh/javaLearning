package refresher;

public class MaximumElement {
    public static void main(String[] args) {
        int Max[] = {-1,-2,-3,-4,-5,-6,-7};
        int Ans = Integer.MIN_VALUE;
        MaximumElement obj = new MaximumElement();
        obj.Maximum(Max, Ans);
        obj.Maximum1(Max, Ans);
    }
    public int Maximum(int[] Max, int Ans){
        for(int i = 0; i<Max.length; i++){
            if(Ans < Max[i] ){
                Ans = Max[i] ;
            }
        }
        return Ans;
    }
    public void Maximum1(int[] Max, int Ans){
        for(int i = 0; i<Max.length; i++){
            if(Ans < Max[i] ){
                Ans = Max[i] ;
            }
        }
        System.out.println(Ans);
    }
}
