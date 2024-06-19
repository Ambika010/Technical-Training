// https://leetcode.com/problems/transpose-matrix/

// matrix editing
public class LeetCode_Question867 {
    public static int[][] transpose(int[][] matrix) {
        int temp[][]=new int[matrix[0].length][matrix.length];
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                temp[col][row]=matrix[row][col];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Original matrix :");
        for(int a[]:matrix){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        int transpose[][] = transpose(matrix);
        System.out.println("Transpose matrix :");
        for(int a[]:transpose){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
