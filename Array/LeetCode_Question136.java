// https://leetcode.com/problems/single-number/description/

public class LeetCode_Question136 {
    public static int singleNumber(int[] nums) {
        int result=0;
        for(int i:nums){
            result^=i;
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
}
