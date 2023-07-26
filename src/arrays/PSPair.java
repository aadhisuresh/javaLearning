package arrays;

public class PSPair {
    static int Prefix(String A) {
        int ans = 0;
        int countOfA = 0;
        for(int i= 0; i<A.length(); i++){
            if(A.charAt(i) == 'a') {
                countOfA++;
            } else if(A.charAt(i) == 'g') {
                ans += countOfA;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String A = "aga";
        System.out.println(Prefix(A));
    }

}

