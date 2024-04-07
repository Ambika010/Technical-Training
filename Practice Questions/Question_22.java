//calculate gcd of two numbers
import java.util.Scanner;
public class Question_22 {
    //method 1
    static int computeGCD(int a, int b){
        int min = a>b?b:a;
        while(min>0){
            if(a%min==0 && b%min==0){
                break;
            }
            min--;
        }
        return min;
    }
    //mehtod 2
    //using euclidean algorithm --> Division method
    static int computeGCD1(int a, int b){
        while((a%b)!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return b;
    }
    //method 3
    //using euclidean algorithm --> Subtraction method
    static int computeGCD2(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a; //or b
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number = ");
        int a=sc.nextInt();
        System.out.print("Enter the second number = ");
        int b=sc.nextInt();
        int result_1 = computeGCD(a, b);
        System.out.println("GCD = " +result_1);
        int result_2 = computeGCD1(a, b);
        System.out.println("GCD using division method = "+result_2);
        int result_3 = computeGCD2(a, b);
        System.out.println("GCD using subtraction method = "+result_3);
    }
}
