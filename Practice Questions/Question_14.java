public class Question_14 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            int space=n-row;
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
