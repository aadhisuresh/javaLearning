package refresher;

import java.util.Scanner;

public class PerfectSquare {
    static int squareRoot(int N){

        for(int i=1; i*i<=N; i++) {
            if(i*i == N) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a prime number: ");
        int N = sc.nextInt();
        int squareRootNumber =squareRoot(N);
        if(squareRootNumber == 0) System.out.println("The number is not a perfect square");
        else System.out.println("The square root is: " + squareRootNumber);
    }
    //time complexity
}
