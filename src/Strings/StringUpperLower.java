package Strings;

public class StringUpperLower {
    public static void main(String[] args) {
        String str = "lowerUPPER";
        int N = str.length();
        UpperLower(str, N);
    }
    static void UpperLower(String str, int N){
        for(int i =0; i < N; i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                System.out.println((char) (str.charAt(i) + 32) + " ");
            } else {
                System.out.println((char) (str.charAt(i) - 32) + " ");
            }
        }
    }
}
