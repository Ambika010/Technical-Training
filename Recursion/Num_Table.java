public class Num_Table {
    static String printTable2(int num, int val){
        if(val==0){
            return " ";
        }
        String result=printTable2(num, val-1);
        String expression=num+" * "+val+" = "+(num*val)+"\n";
        result = result+expression;
        return result;
    }
    static void printTable(int num, int value){
        if(value==0){
            return;
        }
        int result = num*value;
        //System.out.println(num+" * "+value+" = "+result);
        printTable(num, value-1);//tail recursion
        System.out.println(num+" * "+value+" = "+result);
    }
    public static void main(String[] args) {
        printTable(5, 10);
        String r = printTable2(5, 10);
        System.out.println(r);
    }
}
