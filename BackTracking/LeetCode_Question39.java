import java.util.ArrayList;
import java.util.List;

public class LeetCode_Question39 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> small=new ArrayList<>();
        List<List<Integer>> finalList=new ArrayList<>();
        helper(candidates, target, 0, small, finalList);
        return finalList;
    }
    static void helper(int[] candidates, int target, int index, List<Integer> small, List<List<Integer>> finalList){
        if(target<0){
            return;
        }
        if(target == 0){
            finalList.add(new ArrayList<Integer>(small));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            small.add(candidates[i]);
            //target=target-candidates[i];
            helper(candidates, target-candidates[i], i, small, finalList);
            small.remove(small.size()-1);
        }
    }
    public static void main(String[] args) {
        int candidates[] = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates,7));
    }
}
