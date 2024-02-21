public class Question_7 {
    public static boolean isArmstrong(int num){
        int count=0;
        int copy=num;
        int x=num;
        int sum=0;
        while(num>0){
            num=num/10;//make number small
            count++;
        }
        while(copy>0){
            int r=copy%10;
            sum=sum+(int)(Math.pow(r, count));
            copy=copy/10;
        }
        if(sum==x){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num=100;
        boolean result=isArmstrong(num);
        System.out.println(result);
    }
}