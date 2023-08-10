package Strings;

public class ReversingStrings {
    public static void main(String[] args) {
        String str = "Hello";
        int N = str.length();
        System.out.println("Original:");
        System.out.println(str);
        System.out.println("Reverse:");
        System.out.println(Reverse2(str,N));
    }
    public static String Reverse2(String str, int N){
        String reverse = "";
        for(int i = 0; i < N;i++){
            reverse = str.charAt(i) + reverse;
        }
        return reverse;
    }
}
