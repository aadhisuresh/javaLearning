package Strings;

public class StringLowerCase {
    public static void main(String[] args) {
        String str = "AMeRICAn";
        int N = str.length();
        lowercase(str, N);
    }
    static void lowercase(String str, int N){
        for(int i =0; i < N; i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                System.out.println((char) (str.charAt(i) + 32) + " ");
            } else {
                System.out.println(str.charAt(i));
            }
        }
        System.out.println();
    }
}


