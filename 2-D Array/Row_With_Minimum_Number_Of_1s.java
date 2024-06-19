// https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1

public class Row_With_Minimum_Number_Of_1s {
    //as the matrix is not sorted binary search is not applicable here
    static int minRow(int n, int m, int a[][]) {
        int resultRow=-1;
        int min=Integer.MAX_VALUE;
        for(int row=0; row<n; row++){
            int countOnes=0;
            for(int col=0; col<m; col++){
                if(a[row][col]==1){
                    countOnes++;
                }
            }
            if(countOnes<min){
                min=countOnes;
                resultRow=row+1; // Adjust for 1-based index
            }
        }
        return resultRow;
    }
    public static void main(String[] args) {
        int a[][] = {{1, 1, 1, 1}, {1, 1, 0, 0}, {0, 0, 1, 1}, {1, 1, 1, 1}};
        int n=4;
        int m=4;
        System.out.println(minRow(n, m, a));
    }
}
