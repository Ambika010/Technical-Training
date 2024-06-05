import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_Question40 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> small = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, small, finalList, 0);
        return finalList;
    }
    public static void helper(int[] candidates, int target, List<Integer> small, List<List<Integer>> finalList, int index){
        if(target == 0){
            finalList.add(new ArrayList<Integer>(small));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index; i<candidates.length; i++){
            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }
            small.add(candidates[i]);
            helper(candidates, target-candidates[i], small, finalList, i+1);
            small.remove(small.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(combinationSum2(candidates, target));
    }
}
