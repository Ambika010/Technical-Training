public class Sum_of_digit {
    static int sumOfdigit(int num){
        if(num==0){
            return 0;
        }
        int sum = sumOfdigit(num/10);
        sum=sum+num%10;
        return sum;
    }
    /*
    //use of tail recursion
    //small problem+recursion
    //base case
    static void sumOfdigit(int num, int sum){
        if(num==0){
            System.out.println("Sum of digits= "+sum);
            return;
        }
        int r = num%10; //r is a local variable
        sumOfdigit(num/10, sum+r);
    } 
    */
    public static void main(String[] args) {
        System.out.println(sumOfdigit(123));
    }
}
