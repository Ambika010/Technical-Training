// https://leetcode.com/problems/matrix-diagonal-sum/

public class LeetCode_Question1572 {
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int row=0; row<mat.length; row++){
            for(int col=0; col<mat[0].length; col++){
                if(row==col){
                    sum=sum+mat[row][col];
                }
                if((row+col) == mat.length-1 && row!=col){
                    sum=sum+mat[row][col];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int mat[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(diagonalSum(mat));
    }
}
