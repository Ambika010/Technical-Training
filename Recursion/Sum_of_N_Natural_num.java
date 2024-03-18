public class Sum_of_N_Natural_num {
    static void calculateSum(int n, int sum){
        if (n==0){
            System.out.println("sum of n natural numbers = "+sum);
            return;
        }
        sum=sum+n;
        calculateSum(n-1, sum);
    }
    static int calculateSum2(int n){
        if(n==0){
            return 0;
        }
        int sum = calculateSum2(n-1);
        sum=sum+n;
        return sum;
    }
    public static void main(String[] args) {
        calculateSum(10, 0);
        System.out.println("sum of n natural numbers = "+calculateSum2(12));
    }
}
