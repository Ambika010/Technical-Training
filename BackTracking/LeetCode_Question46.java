import java.util.List;
import java.util.ArrayList;

public class LeetCode_Question46{
    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> small=new ArrayList<>();
        List<List<Integer>> finalList=new ArrayList<>();
        helper(nums, small, finalList);
        return finalList;
    }
    static void helper(int nums[], List<Integer> small, List<List<Integer>> finalList){
        if(nums.length == small.size()){
            finalList.add(new ArrayList<Integer>(small));
            return;
        }
        //iterate all the options
        for(int i=0;i<nums.length;i++){
            if(!small.contains(nums[i])){ //when current value is not part of small list
                small.add(nums[i]);
                helper(nums, small, finalList); //Recursion call
                //stack fall
                //undo
                small.remove(small.size()-1);
            }
            //helper(nums, small, finalList);
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(permute(nums));
    }
}