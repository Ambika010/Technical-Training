//square pattern
public class Question_10 {
    public static void main(String[] args) {
        int n=4;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
Printing rules of patterns
i.) Left to Right --> print
ii.) Top to Bottom --> println
*/
//row ke loops ke ander column ki loops chalegi