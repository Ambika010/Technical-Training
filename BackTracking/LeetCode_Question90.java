import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_Question90 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> small=new ArrayList<>();
        List<List<Integer>> finalList=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, 0, small, finalList);
        return finalList;
    }
    public static void helper(int nums[], int index, List<Integer> small, List<List<Integer>> finalList){
        //fill small list in big list
        finalList.add(new ArrayList<Integer>(small));
        //loop
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            small.add(nums[i]);
            helper(nums, i+1, small, finalList); //Recursion call
            //stack fall
            //undo
            small.remove(small.size()-1);
            
        }
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 2};
        System.out.println(subsetsWithDup(nums));
    }
}
