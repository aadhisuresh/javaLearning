package arrays;

import java.util.Arrays;

public class RotateArray2 {
    public static int[] reverse(int [] nums, int Si, int Sj) {// reverse and rotate
        int Start = Si;
        int End = Sj;
        while (Start < End){
            int x = nums[Start];
            nums[Start] = nums[End];
            nums[End] = x;
            Start++;
            End--;
        }
        return nums;
    }

    static int[] rotateArray(int[] arr, int K) {
        int N = arr.length;
        System.out.print("Öriginal Array: ");
        System.out.println(Arrays.toString(arr));
        reverse(arr, 0, N-1);
        System.out.print("Reversed Array: ");
        System.out.println(Arrays.toString(arr));
        reverse(arr, N-1, K-1);
        System.out.print("Reversing first K elements: ");
        System.out.println(Arrays.toString(arr));
        reverse(arr, K, N-1);
        System.out.print("Reversing remaining N-K elements: ");
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6}; //Array
        int N = A.length; // Variable for Array Length
        int K = 2; // Number of Rotations
        K = K % N; // Finding the Remainder of the Rotations using modulo
        //K = K / N; // Finding the Quiotient of the Rotations
        rotateArray(A, K); // Calling the Method
    }
}
