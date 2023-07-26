package arrays;

public class CountOfElements {
    public static void main(String[] args) {
        int array[] = {7, 4, 2, 10, 5, 6};
        int count = countofElements(array);
        System.out.println(count);
    }
    static int countofElements(int [] array){
        int N = array.length;
        int maxValue = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < N; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                count = 0;
            }
            if (array[i] == maxValue) {
                count++;
            }
        }
//         System.out.println(count);
        return N - count;
    }
}
