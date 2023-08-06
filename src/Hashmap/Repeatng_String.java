package Hashmap;
import java.util.HashSet;

public class Repeatng_String {

    public static void main(String[] args) {
        String str = "aefgaurf";
        char [] ch = str.toCharArray();
        System.out.println(firstRepeatingElement(ch));

    }
    public static char firstRepeatingElement(char[] str) {

        HashSet<Character> set = new HashSet<>();

        char ch = '0';
        for(int i = 0; i < str.length; i++){

            if(set.contains(str[i])) {
                return str[i];
            }
            else {
                set.add(str[i]);
            }
        }
        return ch;
    }


}
