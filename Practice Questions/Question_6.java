import java.util.Scanner;
//rotate a number
//12345 --> 51234 --> 45123, when rotation is 2
public class Question_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=sc.nextInt();
        System.out.print("Enter the number of rotations to be performed:");
        int rotate = sc.nextInt();
        int copy=num;
        int count=0;
        while(copy>0){
            copy=copy/10;
            count++;
        }
        rotate=rotate%count;
        if(rotate<0){
            rotate=rotate+count;
        }
        int rhs = num % (int)(Math.pow(10, rotate));
        int lhs = num/(int)(Math.pow(10, rotate));
        int result = rhs*(int)Math.pow(10, count-rotate)+lhs;
        System.out.println(result);
    }
}
