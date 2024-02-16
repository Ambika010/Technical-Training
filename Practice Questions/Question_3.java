//find the sum of even and odd digits of the given number
import java.util.Scanner;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum_even=0;
        int sum_odd=0;
        while(num>0){
            int r = num%10;
            num = num/10;
            if(r%2==0){
                sum_even=sum_even+r;
            }else{
                sum_odd=sum_odd+r;
            }
        }
        System.out.println("sum of even digits : "+sum_even);
        System.out.println("sum of odd digits : "+sum_odd);
    }
}
