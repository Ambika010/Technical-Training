/*
input str = "AAAABBBCCCDC"
output str = "ABCDC"
*/
public class Remove_Consecutive_Duplicate_From_String {
    static String removeConsecutiveDuplicates(String str){
        if(str.length()<=1){
            return str;
        }
        String smallString=str.substring(1);
        String result=removeConsecutiveDuplicates(smallString);
        if(str.charAt(0)!=result.charAt(0)){ // or (str.charAt(0)==str.charAt(1)) then return result 
            return str.charAt(0)+result;
        }else{
            return result;
        }
    }
    public static void main(String[] args) {
        String input = "AAAABBBCCCDC";
        String result = removeConsecutiveDuplicates(input);
        System.out.println(result);
    }
}