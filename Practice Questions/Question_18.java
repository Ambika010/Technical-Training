//print digit
//given num : 12345
//Output --> 1
//           2
//           3
//           4
//           5
public class Question_18 {
    public static void main(String[] args) {
        int num=12345;
        int copy=num;
        int x=num;
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        while(copy!=0){
            int digit=copy/(int)(Math.pow(10, count-1));
            System.out.println(digit);
            copy=copy%(int)(Math.pow(10, count-1));
            count--;
        }
    }
}
