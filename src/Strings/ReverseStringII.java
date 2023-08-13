package Strings;

import java.util.Arrays;

public class ReverseStringII {

    //given a string, reverse it and remove all the leading and trailing spaces.
    // example: String str = " Aadhi programs in Java   "
    // result -> "Java in programs Aadhi"
    public static void main(String[] args) {
        String str = " Aadhi programs      in Java   ";
        String [] word = str.trim().split(" ");
        int N = word.length;
        System.out.println("Original:");
        System.out.println(Arrays.toString(word));
        String [] word2 = Rev(word,N).trim().split(" ");
        System.out.println("Reverse:");
        System.out.println(Arrays.toString(word2));

    }
    static String Rev(String [] word, int N){
        String rev = "";
        for(int i = 0; i < N; i++){
            if(word[i] == ""){
                continue;
            }
            rev = word[i]+" "+ rev;
        }
        return rev;
    }
}
