/*
input str = "AABB"
output str ="A*AB*B"
*/
public class Print_Adjacent_Star {
    static String printAdjacentStar(String str){
        if(str.length()<=1){
            return str;
        }
        String s = str.substring(1);
        String result = printAdjacentStar(s);
        if(str.charAt(0)==result.charAt(0)){ //or (str.charAt(0)==str.charAt(1))
            return str.charAt(0)+"*"+result;
        }else{
            return str.charAt(0)+result;
        }
    }
    public static void main(String[] args) {
        String input = "AABB";
        String output = printAdjacentStar(input);
        System.out.println(output);
    }
}
