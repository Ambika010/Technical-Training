public class Climbing_Stairs {
    static int climbStairs(int n) {
        //small problem
        if(n==0){
            //reach to top
            return 1; //count as 1
        }
        if(n<0){
            //by pass the top
            return 0; //not counted
        }
        int count1 = climbStairs(n-1);
        int count2 = climbStairs(n-2);
        return count1+count2;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
