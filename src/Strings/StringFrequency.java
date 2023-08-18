package Strings;

public class StringFrequency {
    public static void main(String[] args) {

        frequency("aadhi", 'a');

    }



    static void frequency(String str, char ch){

        int count = 0;
        for(int i = 0; i <str.length(); i++) {

            if(str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Count of elements total - "+count);

    }


}
