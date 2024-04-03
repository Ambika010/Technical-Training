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
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println((count==2)?"prime":"not prime");
    }*/

    //suppose num=64
    //1*64=64  <=>   64*1=64
    //2*32=64  <=>   32*2=64
    //4*16=64  <=>   16*4=64
    //8*8=64         (after 8*8 the factors are repeated)
    //so to optimise the solution: (x*x=num => pow(x,2)=num => x=sqrt(num))
    //we will go only till (sqrt(num))
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int flag=0;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                flag=1;
                break;//exit from loop
            }
        }
        System.out.println((flag==1)?"not prime":"prime");
    }
}
