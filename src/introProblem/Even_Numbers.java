package introProblem;

public class Even_Numbers {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 1; i < num;i++)
        {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }
        }
    }
}
