import java.util.ArrayList;
import java.util.List;

public class LeetCode_Question77 {
    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> small=new ArrayList<>();
        List<List<Integer>> finalList=new ArrayList<>();
        helper(n, k, 1, small, finalList);
        return finalList;
    }
    public static void helper(int n, int k, int index, List<Integer> small, List<List<Integer>> finalList){
        if(small.size()==k){
            finalList.add(new ArrayList<Integer>(small));
            return;
        }
        for(int i=index;i<=n;i++){
            if(!small.contains(i)){
                small.add(i);
                helper(n, k, i, small, finalList); //Recursion call
                //stack fall
                //undo
                small.remove(small.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int n=4;
        int k=2;
        System.out.println(combine(n, k));
    }
}
