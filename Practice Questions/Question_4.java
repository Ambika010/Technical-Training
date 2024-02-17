import java.util.Scanner;

//flip digit with position
//position=1, digit=5 --> position=5, didgit=1
public class Question_4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int pos=0;
        int sum=0;
        while(num>0){
            //get the digit of a number
            int lastDigit = num%10;
            //count the position
            pos=pos+1;
            int place = (int)Math.pow(10, lastDigit-1);
            sum = sum + pos * place;
            num=num/10;
        }
        System.out.println(sum);
    }
}