package refresher;

public class OddNumber {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        System.out.println("OddNumber");
        OddNumber obj = new OddNumber();
        obj.Odd(array);
        obj.Odd1(array);
    }
    public int[] Odd(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
        return array;
    }
    public void Odd1(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
