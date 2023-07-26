package arrays;

public class TwoSum {
    public static void main(String[] args) {
        int array[] = {-2, -1, 5, 0, 0};
        TwoSum obj = new TwoSum();
        int k = 10;
        System.out.println(obj.Sum(array , k));
    }

    static boolean Sum(int[] array, int k) {
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                sum = array[i] + array[j];
                if (k == sum && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}
