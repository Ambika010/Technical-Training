import java.util.List;
import java.util.ArrayList;

public class LeetCode_Question78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> small=new ArrayList<>();
        List<List<Integer>> finalList=new ArrayList<>();
        helper(nums, 0, small, finalList);
        return finalList;
    }
    static void helper(int nums[], int index, List<Integer> small, List<List<Integer>> finalList){
        //fill small list in big list
        finalList.add(new ArrayList<Integer>(small));
        //loop
        for(int i=index;i<nums.length;i++){
            if(!small.contains(nums[i])){
                small.add(nums[i]);
                helper(nums, i, small, finalList); //Recursion call
                //i will be increment only one stack fall, it means for next recusrsion cal index will be pass as incremented value
                //stack fall
                //undo
                small.remove(small.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        System.out.println(subsets(nums));
    }
}

/*
[]
[1] [1,2] [1,2,3] [1,3] index = 1 (1 ke baad ka elements)
[2] [2,3] index = 2 (2 ke baad ka elements)
[3] index = 3 (3 ke baad ka elements)
*/

/*
Steps:
i.) loop(3 branch)
ii.) Recursion
iii.) index maintain (humesha uss index se elements consider krna hai, uske peeche wale elements ko consider nhi krna hai)
iv.) small Array
v.) big array ke ander small array
*/