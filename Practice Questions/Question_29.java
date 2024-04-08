//hollow right angle triangle pattern
public class Question_29 {
    public static void main(String[] args) {
        int n=7;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                if(col==1 || row==n || col==row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
