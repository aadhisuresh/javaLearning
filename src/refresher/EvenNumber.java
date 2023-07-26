package refresher;

public class EvenNumber {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        System.out.println("EvenNumber");
        EvenNumber obj = new EvenNumber();
        obj.Even(array);
        obj.Even1(array);
    }

    public int[] Even(int[] array) {

        System.out.println("EvenNumber");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

        return array;
    }
    public void Even1(int[] array) {

        System.out.println("EvenNumber");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

}
