//using nested if-else calculate the greatest among 4 numbers
import java.util.Scanner;
public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println(a+" is greatest");
                }else{
                    System.out.println(d+" is greatest");
                }
            }else{
                if(c>d){
                    System.out.println(c+" is greatest");
                }else{
                    System.out.println(d+" is greatest");
                }
            }
        }else{
            if(b>c){
                if(b>d){
                    System.out.println(b+" is greatest");
                }else{
                    System.out.println(d+" is greatest");
                }
            }else{
                if(c>d){
                    System.out.println(c+" is greatest");
                }else{
                    System.out.println(d+" is greatest");
                }
            }
        }
    }
}
