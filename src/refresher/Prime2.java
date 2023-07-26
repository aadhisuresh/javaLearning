package refresher;

import java.util.Scanner;

public class Prime2 {
    static boolean isPrime(int N){
        int count = 0;
        for(int i=1; i*i<=N; i++){
            if(N%i == 0) {
                if (i * i == N) {
                    count += 1;
                } else {
                    count += 2;
                }
            }
        }
        System.out.println("Number of Factors are: " +count);
        if(count == 2) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a prime number: ");
        int N = sc.nextInt();
        boolean isPrime = isPrime(N);
        if(isPrime) System.out.println("Number is Prime");
        else System.out.println("Number is not Prime");
    }
}
