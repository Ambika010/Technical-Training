public class Search_And_Replace_String {
    static String searchAndReplace(String str,char search, char replace){
        if(str.length()==0){
            return "";
        }
        String result = searchAndReplace(str.substring(1), search, replace);
        if(str.charAt(0)==search){
            return replace+result;
        }else{
            return str.charAt(0)+result;
        }
    }
    public static void main(String[] args) {
        String result = searchAndReplace("Hello", 'l', 'x');
        System.out.println(result);
    }
}
