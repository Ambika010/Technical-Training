// https://leetcode.com/problems/rotate-image/

public class LeetCode_Quetsion48 {
    public static void rotate(int[][] matrix) {
        // matrix editing
        // Step - 1 : Transpose of the original matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Steo - 2 : reverse each row of the transpose matrix
        for(int i=0; i<matrix.length; i++){
            int x=0;
            int y=matrix[0].length-1;
            while(x<=y){
                int temp = matrix[i][x];
                matrix[i][x] = matrix[i][y];
                matrix[i][y] = temp;
                x++;
                y--;
            }
        }
        for(int a[]:matrix){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
}
