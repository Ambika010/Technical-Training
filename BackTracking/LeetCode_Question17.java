import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LeetCode_Question17 {
    // 2 - 9
    static String keys[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> letterCombinations(String digits) {
        if(digits.length()==0) {
            return new ArrayList<String>();
        }else{
            return helper(digits);
        }
    }
    public static List<String> helper(String digits) {
        //base case
        if(digits.length()==0) {
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // digits = "23"
        char singleChar = digits.charAt(0); // '2'
        // '2' - Ascii(50)
        // '0' - Ascii(48)
        // '2'-'0' (50-48=2) //character to numeric
        int index = singleChar - '0';
        String str = keys[index]; //"abc"
        List<String> finalList = new ArrayList<>();
        for(int i=0;i<str.length();i++) {
            List<String> tempList = helper(digits.substring(1));
            for(int j=0;j<tempList.size();j++) {
                finalList.add(str.charAt(i)+tempList.get(j));
            }
        }
        return finalList;
    }
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}
