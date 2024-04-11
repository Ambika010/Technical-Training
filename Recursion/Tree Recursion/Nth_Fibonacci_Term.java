public class Nth_Fibonacci_Term {
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        //small problem n-1
        int firstTerm=fibo(n-1);
        int secondTerm=fibo(n-2);
        int thirdTerm=firstTerm+secondTerm;
        return thirdTerm;
    }
    public static void main(String[] args) {
        int r=fibo(7);
        System.out.println(r);
    }
}

//exponential time complexity : 2^n -- Brute force solution