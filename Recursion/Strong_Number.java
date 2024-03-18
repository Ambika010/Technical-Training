public class Strong_Number {
    static int factorial(int num) {
        if(num==1){
            return 1;
        }
        int fact=factorial(num-1);
        fact=fact*num;
        return fact;
    }
    static void isStrong(int org, int result, int num) {
        if(num==0){
            System.out.println((org==result)?"Strong number":"Not a Strong number");
            return;
        }
        int r=num%10;
        int factorial=factorial(r);
        result=result+factorial;
        isStrong(org, result, num/10);
    }
    static boolean isStrong2(int org, int result, int num) {
        if(num==0){
            return(org==result);
        }
        int r=num%10;
        int fact=factorial(r);
        result=result+fact;
        return isStrong2(org, result, num/10);
    }
    public static void main(String[] args) {
        isStrong(145, 0, 145);
        System.out.println(isStrong2(145, 0, 145));
    }
}