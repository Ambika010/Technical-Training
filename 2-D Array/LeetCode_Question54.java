import java.util.List;
import java.util.ArrayList;

// https://leetcode.com/problems/spiral-matrix/

public class LeetCode_Question54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        while(top<=bottom && left<=right){ 
            // left to right
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            // top to bottom
            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            // right to left
            if(top <= bottom){ // if the matrix has only one row
                for(int i=right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            // bottom to top
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }
}
