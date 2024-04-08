//hollow diamond pattern
public class Question_26 {
    public static void main(String[] args) {
        int n=8;
        for(int row=1;row<=n;row++){
            for(int col=row;col<=n;col++){
                System.out.print("*");
            }
            int space=2*row-2;
            for (int s = 1; s<=space; s++) {
                System.out.print(" ");
            }
            for(int col=row;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=n;row>=1;row--){
            for(int col=row;col<=n;col++){
                System.out.print("*");
            }
            int space=2*row-2;
            for (int s = 1; s<=space; s++) {
                System.out.print(" ");
            }
            for(int col=row;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
