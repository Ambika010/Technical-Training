/*
input str = Hi Amit Hi Rohan
output str = Hello Amit Hello Rohan
*/
public class Hi_Replace_With_Hello_String {
    static String replaceHiWithHello(String str){
        if(str.length()<=1){ //bcs we check for 0th index as well as (0+1)th index
            return str; //bcs we stop at last index so we return the character present at the last index and then further concatenation takes place during stack falling
        }
        if(str.charAt(0)=='H' && str.charAt(1)=='i'){
            String s1=str.substring(2);
            String result=replaceHiWithHello(s1);
            return "Hello"+result;
        }else{
            String s1=str.substring(1);
            String result=replaceHiWithHello(s1);
            return str.charAt(0)+result;
        }
    }
    public static void main(String[] args) {
        String str = "Hi Amit Hi Rohan";
        String result = replaceHiWithHello(str);
        System.out.println(result);
    }
}
