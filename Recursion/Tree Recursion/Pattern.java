public class Pattern{
    static void printStar(int numberOfStars){
        if(numberOfStars==0){
            return;
        }
        System.out.print("*");
        printStar(numberOfStars-1);
    }
    static void printLine(int numberOfLines){
        //base case
        if(numberOfLines==0){
            return;
        }
        printLine(numberOfLines-1);
        //stack fall
        printStar(numberOfLines);
        System.out.println();
    }
    public static void main(String[] args) {
        printLine(5);
    }
}