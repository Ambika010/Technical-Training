public class Question_9 {
    public static void main(String[] args) {
        int num=1234;
        int copy=num;
        int count=0;
        int sum=0;
        while(num>0){
            num=num/10;
            count++;
        }
        int last=copy%10;
        int first=copy/(int)(Math.pow(10, count-1));
        int middle=(copy%(int)(Math.pow(10, count-1)))/10;
        sum=sum+last*(int)Math.pow(10, count-1)+first+middle*10;
        System.out.println(sum);
    }
}
