public class Extract_digits_of_a_Num {
    static void printDigits(int num){
        if(num==0){
            return;
        }
        int r=num%10;
        printDigits(num/10);
        System.out.println(r); 
    }
    static int printDigits2(int num){
        if(num==0){
            return 0;
        }
        printDigits(num/10);
        int rem=num%10;
        return rem;
    }
    public static void main(String[] args) {
        printDigits(12345);
        System.out.println(printDigits2(235671233));
    }
}
