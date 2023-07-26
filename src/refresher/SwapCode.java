package refresher;
import java.util.Arrays;
public class SwapCode {

    public static void main(String[] args) {
        int[] nums = {};
        int[] A = {1,2,3,4,5};
        int[] ans1 = swap(nums);
        System.out.println(Arrays.toString(ans1));
        int[] ans2 = swap(A,2,3);
        System.out.println(Arrays.toString(ans2)); // arguments
        SwapCode obj = new SwapCode();
        obj.swap1(nums);
    }
    public static int[] swap(int [] nums) {//parameters
        if (nums.length == 0) return new int[] {};
        int x = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = x;
        return nums;
    }

    public static int[] swap(int [] nums, int index1, int index2) {
        if (nums.length == 0) return new int[] {};
        int x = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = x;
        return nums;
    }
    public void swap1(int [] nums){
        if (nums.length == 0);
        int x = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = x;
    }


}
