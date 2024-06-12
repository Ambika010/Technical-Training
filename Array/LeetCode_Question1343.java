// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/

public class LeetCode_Question1343 {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int sum=0;
        for(int i=0; i<k; i++){
            sum=sum+arr[i];
        }
        double average = sum/k;
        if(average>=threshold) {
            count++;
        }
        for(int i=k; i<arr.length; i++){
            sum=sum+arr[i]-arr[i-k];
            average=sum/k;
            if(average>=threshold) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.println(numOfSubarrays(arr, k, threshold));
    }
}
