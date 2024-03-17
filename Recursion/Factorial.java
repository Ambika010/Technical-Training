public class Factorial {
    //return wale case mei stack fall pe kaam krte hai
    static int factorial(int num){
        //one time (base case)
        if(num==1){
            return 1;
        }
        //repeat 
        int fact=factorial(num-1);
        fact=fact*num;
        return fact;
    }
    static void factorial(int num, int fact){
        if(num==1){
            System.out.println(fact);
            return;
        }
        fact = fact*num;
        factorial(num-1, fact);
    }
    public static void main(String[] args) {
        factorial(6, 1); //void
        System.out.println(factorial(5)); //int
    }
}
