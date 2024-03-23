public class Reverse_String {
    static String reverseString(String s){
        if(s.length()==0){
            return "";
        }
        String smallString = s.substring(1);
        String result = reverseString(smallString);
        return result+s.charAt(0);
    }
    public static void main(String[] args) {
        String r = reverseString("ambika");
        System.out.println(r);
    }
}
