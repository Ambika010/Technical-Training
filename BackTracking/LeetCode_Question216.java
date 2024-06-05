import java.util.List;
import java.util.ArrayList;

public class LeetCode_Question216 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> small = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        helper(k, n, small, finalList, 1);
        return finalList;
    }
    public static void helper(int k, int n, List<Integer> small, List<List<Integer>> finalList, int index){
        if(n==0){
            if(small.size()==k){
                finalList.add(new ArrayList<Integer>(small));
                return;
            }
        }
        if(n<0){
            return;
        }
        for(int i=index; i<=9; i++){
            small.add(i);
            helper(k, n-i, small, finalList, i+1);
            small.remove(small.size()-1);
        }
    }
    public static void main(String[] args) {
        int k=3;
        int n=9;
        System.out.println(combinationSum3(k, n));
    }
}
