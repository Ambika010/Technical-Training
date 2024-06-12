// fixed size window (sliding window)
// given an integer array nums and an integer k, find the sum of the subarray with the largest sum whose length is k
public class Longest_K_Size_Window_Sum {
    public static void main(String[] args) {
        int nums[] = {3, -1, 4, 12, -8, 5, 6};
        int k=5; // window size for fixed size window sliding
        int sum=0;
        int max=Integer.MIN_VALUE;
        // compute the sum of first window
        for(int i=0; i<k; i++){
            sum=sum+nums[i];
        }
        max=sum;
        // now compute the sum of rest of the windows
        for(int i=k; i<nums.length; i++){
            sum=sum+nums[i]-nums[i-k]; // add the right part and minus the left part
            max=Math.max(max, sum);
        }
        System.out.println(max);
    }
}
