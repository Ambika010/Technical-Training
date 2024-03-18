public class Armstrong_Number {
    static int countDigits(int num){
        if(num==0){
            return 0;
        }
        int count=countDigits(num/10);
        count++;
        return count;
    }
    static void isArmstrong(int num, int result, int org){
        if(num==0){
            System.out.println((org==result)?"Armstrong Number":"Not a Armstrong Number");
            return;
        }
        int r=num%10;
        int count=countDigits(org);
        result=result+(int)Math.pow(r, count);
        isArmstrong(num/10, result, org);
    }
    static boolean isArmstrong2(int num, int result, int org){
        if(num==0){
            return (org==result);
        }
        int r=num%10;
        int count=countDigits(org);
        result=result+(int)Math.pow(r, count);
        return isArmstrong2(num/10, result, org);
    }
    public static void main(String[] args) {
        isArmstrong(153, 0, 153);
        System.out.println(isArmstrong2(153, 0, 153));
    }
}
