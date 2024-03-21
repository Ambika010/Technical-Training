public class Palindrome_Number {
    static boolean isPalindrome2(int org,int reverse,int num){
        if(num==0){
            return(org==reverse);
        }
        int r=num%10;
        reverse=reverse*10+r;
        return isPalindrome2(org, reverse, num/10);
    }
    static void isPalindrome(int org,int reverse,int num){
        if(num==0){
            System.out.println((org==reverse)?"Palindrome":"Not Plaindrome");
            return;
        }
        int r=num%10;
        reverse=reverse*10+r;
        isPalindrome(org, reverse, num/10);

    }
    public static void main(String[] args) {
        isPalindrome(152,0,152);
        boolean result = isPalindrome2(121, 0, 121);
        System.out.println(result);
    }
}
