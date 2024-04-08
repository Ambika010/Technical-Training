public class Question_27 {
    public static void main(String[] args) {
        int n=5;
        char c='A';
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
