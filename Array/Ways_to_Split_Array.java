// https://leetcode.com/problems/number-of-ways-to-split-array/

public class Ways_to_Split_Array {
    public static int waysToSplitArray(int[] nums) {
        long entireSum=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            entireSum=entireSum+nums[i];
        }
        // now remove the current everytime from the entire sum
        // and store the current sum in the left sum
        long leftSum=0;
        for(int i=0; i<nums.length-1; i++){
            leftSum=leftSum+nums[i];
            entireSum=entireSum-nums[i];
            if(leftSum>=entireSum){
                count++;
            }
        }
        return count;

        // OR

        /*
        int countValidSplits=0;
        // create a prefix array
        long prefix[] = new long[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i=0; i<nums.length-1; i++){
            long leftPart = prefix[i];
            long rightPart = prefix[prefix.length-1] - prefix[i];
            if(leftPart>=rightPart){
                countValidSplits++;
            }   
        }
        return countValidSplits;
        */
    }
    public static void main(String[] args) {
        int nums[]={10,4,-8,7};
        System.out.println(waysToSplitArray(nums));
    }
}
