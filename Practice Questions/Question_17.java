//Sum of digits of a number
public class Question_17 {
    public static void main(String[] args) {
        int num=12345;
        int x=num;
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of digits of the number "+x+" = "+sum);
    }
}
