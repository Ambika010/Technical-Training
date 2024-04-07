//hollow triangle pattern
public class Question_24 {
    public static void main(String[] args) {
        int n=8;
        for(int row=1;row<=n;row++){
            int space=n-row;
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            int odd = 2*row-1;
            for(int col=1;col<=odd;col++){
                if(row==n || col==1 || col==(2*row-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
