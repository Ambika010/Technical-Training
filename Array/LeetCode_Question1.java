import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/two-sum/description/

public class LeetCode_Question1 {
    public static int[] twoSum(int[] nums, int target) {
        int pair[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int result = target - nums[i];
            if(map.get(result)!=null){
                pair[0]=map.get(result);
                pair[1]=i;
            }else{
                map.put(nums[i], i);
            }
        }
        return pair;

        // Or

        /*
        int result[] = new int[2];
        int aux[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(aux);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum=aux[i]+aux[j];
            if(sum==target){
                break;
            }
            else if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
        }
        for(int k=0; k<nums.length; k++){
            if(nums[k]==aux[i]){
                result[0]=k;
            }
        }
        for(int k=nums.length-1; k>=0; k--){
            if(nums[k]==aux[j]){
                result[1]=k;
            }
        }
        return result;
        */
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        int result[] = twoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
