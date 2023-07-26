package refresher;

import java.util.Scanner;

public class Prime {
    static boolean isPrime(int N){
        int count = 0;
        for(int i=1; i<=N; i++){
            if(N%i ==0){
                count++;
            }
        }
        if (count == 2) return true;
        return false;
    }

    static boolean isPrime1(int N){
        int count = 0;
        for(int i=1; i<=N; i++){
            if(N%i ==0){
                count++;
            }
        }
        if (count == 2) return true;
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
