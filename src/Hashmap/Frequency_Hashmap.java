package Hashmap;

import java.util.HashMap;

public class Frequency_Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> table = new HashMap<>();
        int [] A = new int[] {1,1,2,2,3,3,4,5,5,6}; // Array
        int N = A.length;// Length
        // TC = 0(N);
        // SC = 0(N); Hashmap creation.
        for(int i = 0; i < N ;i++){ //For Loop checking each element
            if(table.containsKey(A[i])){ // for loop checking if the required key for hashmap is there
                table.put(A[i], table.get(A[i])+1); //adding the elements in their own hashmap by adding a key then setting the value and adding it by 1 for the number of times it occurs
            } else {
                table.put(A[i], 1); // keeping the numeber same if it occurs only one time
            }
        }
        System.out.println(table); // printing the whole thing out
    }
}
