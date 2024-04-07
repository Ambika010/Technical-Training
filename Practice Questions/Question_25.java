public class Question_25 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=(2*n)-1;row++) {
            for(int col=1;col<=n;col++){
                if((row==1||row==5||row==(2*n)-1)&&(col==1||col==n)){
                    System.out.print(" ");
                }else if(row==1||row==5||row==(2*n)-1||col==1||col==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
