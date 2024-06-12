// https://leetcode.com/problems/maximum-average-subarray-i/
// fixed size window (sliding window)

public class Maximum_Average_SubArray {
    public static double findMaxAverage(int[] nums, int k) {
        double maxAverage=Double.MIN_VALUE;
        int sum=0;
        // sum of first K size Window
        for(int i=0; i<k; i++){
            sum=sum+nums[i];
        }
        maxAverage=(1.0)*sum/k; // typecasting to double
        // remaining window average
        for(int i=k; i<nums.length; i++){
            sum=sum+nums[i]-nums[i-k];
            maxAverage=Math.max(maxAverage, (1.0)*sum/k);
        }
        return maxAverage;
    }
    public static void main(String[] args) {
        int nums[] = {1,12,-5,-6,50,3}; 
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
}
