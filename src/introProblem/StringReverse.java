package introProblem;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String word = "Greek";
        String rev = "";
        for (int i = 0; i < word.length(); i++)
        {
            rev = word.charAt(i) + rev;
        }
        System.out.println(rev);

    }
}
