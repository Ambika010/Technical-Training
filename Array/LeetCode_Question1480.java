import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/

public class LeetCode_Question1480 {
    public static int[] runningSum(int[] nums) {
        // create a prefix array
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        return prefix;
    }
    public static void main(String[] args) {
        int nums[] = {3, 1, 2, 10, 1};
        int result[] = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}
