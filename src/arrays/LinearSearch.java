package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6};
        int N = A.length;
        int k = 4;
        for(int i =0; i <N;i++){
            if(A[i]==k){
                System.out.println("Equal");
            }
        }
    }
}
