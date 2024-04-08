// print prime numbers till N

import java.util.Scanner;
public class Question_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range(N) = ");
        int n=sc.nextInt();
        for(int k=1;k<=n;k++){
            int flag=0;
            for(int i=2;i<=Math.sqrt(k);i++){
                if(k%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                System.out.println(k+" is not a prime number");
            }else{
                System.out.println(k+" is a prime number");
            }
        }
    }
}
