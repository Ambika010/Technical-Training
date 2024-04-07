//LCM of two numbers
// LCM(a,b) = (a*b)/GCD(a,b)
public class Question_23 {
    //using euclidean algorithm --> Subtraction method
    static int GCD(int a, int b){
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
        int a=12;
        int b=24;
        int lcm = (a*b)/GCD(a, b);
        System.out.println("LCM = "+lcm);
    }
}
