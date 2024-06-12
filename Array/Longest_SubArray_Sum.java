// calculate the maximum size of the subarray from the given array whose sum is equal to k
// sliding window approach

public class Longest_SubArray_Sum{
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        int k=8;
        int right=0;
        int left=0;
        int currentSum=0;
        int max=0;
        for(; right<arr.length; right++){
            currentSum = currentSum + arr[right];
            while(currentSum>k){
                currentSum = currentSum - arr[left];
                left++;
            }
            max = Math.max(max, right - left +1);
        }
        System.out.println(max);
    }
}