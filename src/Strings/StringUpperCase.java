package Strings;

public class StringUpperCase {
    public static void main(String[] args) {
        String str = "BritisH";
        int N = str.length();
        Uppercase(str, N);
    }
    static void Uppercase(String str, int N){
        for(int i =0; i < N; i++){
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                System.out.println((char) (str.charAt(i) - 32) + " ");
            } else {
                System.out.println(str.charAt(i));
            }
        }
        System.out.println();
    }
}
