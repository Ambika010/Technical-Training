public class Question_15 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++){
            int space=n-row;
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            int odd = 2*row+1;
            for(int col=1;col<=odd;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//code for win star patter (search on google)