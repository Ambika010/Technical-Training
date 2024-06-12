public class LeetCode_Question209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int right=0; right<nums.length; right++) {
            sum = sum + nums[right];
            while(sum>=target){
                min = Math.min(min, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
    public static void main(String[] args) {
        int target = 7; 
        int nums[] = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }
}
