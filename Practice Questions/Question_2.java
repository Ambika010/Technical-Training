//check whether the given number is prime or not
import java.util.Scanner;
public class Question_2 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int flag=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=1;
                break;//exit from loop
            }
        }
        System.out.println((flag==1)?"not prime":"prime");
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println((count==2)?"prime":"not prime");
    }
}
