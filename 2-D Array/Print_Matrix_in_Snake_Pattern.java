// https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1

import java.util.ArrayList;

public class Print_Matrix_in_Snake_Pattern {
    static ArrayList<Integer> snakePattern(int matrix[][]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int row=0; row<matrix.length; row++){
            if(row%2==0){
                for(int col=0; col<matrix.length; col++){
                    list.add(matrix[row][col]);
                }
            }else{
                for(int col=matrix.length-1; col>=0; col--){
                    list.add(matrix[row][col]);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int matrix[][] = {{45,48,54}, {21,89,87}, {70,78,15}};
        System.out.println(snakePattern(matrix));
    }
}
