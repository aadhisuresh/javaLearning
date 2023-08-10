package Strings;

public class ReversingStringsArray {
    public static void main(String[] args) {
        String str = "Hello";
        int N = str.length();
        System.out.println("Original :-" +str);
        System.out.println(Reverse(str,N));
    }
    public static char[] Reverse(String str, int N){
        char [] ch = str.toCharArray();
        int start = 0;
        int end = N-1;
        while(start < end){
            int x = ch[start];
            ch[start] = ch[end];
            ch[end] = (char) x;
            start++;
            end--;
        }
        return ch;
    }

}
