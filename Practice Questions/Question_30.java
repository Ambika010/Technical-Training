//hollow reverse pyramid
public class Question_30 {
    public static void main(String[] args) {
        int n=8;
        //reverse pyramid
        /*
        for(int row=0;row<n;row++){
            for(int s=0;s<row;s++){
                System.out.print(" ");
            }
            for(int col=0;col<(2*n)-(2*row)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        for(int row=0;row<n;row++){
            for(int s=0;s<row;s++){
                System.out.print(" ");
            }
            for(int col=0;col<(2*n)-(2*row)-1;col++){
                if(row==0 || col==0 || col==(2*n)-(2*row)-2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
