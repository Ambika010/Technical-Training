// https://leetcode.com/problems/is-subsequence/
public class Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {
        int x=0;
        int y=0;
        while(x<s.length() && y<t.length()){
            if(s.charAt(x)==t.charAt(y)){
                x++;
            }
            y++;
        }
        return x==s.length();
    }
    public static void main(String[] args) {
        String t = "ahbgdc";
        String s = "abc";
        System.out.println(isSubsequence(s, t));
    }
}
