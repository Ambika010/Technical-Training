// https://www.geeksforgeeks.org/problems/search-in-a-matrix17201720/1

public class Search_in_a_Matrix {
    public static int matSearch(int mat[][], int N, int M, int X){
        // as the array is sorted we can use binary search
        int colsLen=mat[0].length;
        for(int i=0; i<mat.length; i++){
            int low=0;
            int high=colsLen-1;
            while(low<=high){
                int mid=(high+low)/2;
                if(mat[i][mid]==X){
                    return 1;
                }else if(mat[i][mid]>X){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int mat[][] = {{3,30,38}, {44,52,54}, {57,60,69}};
        int N = 3;
        int M = 3;
        int X = 62;
        System.out.println(matSearch(mat, N, M, X));
    }
}
