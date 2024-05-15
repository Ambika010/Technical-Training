public class RecursionDemo{
    //given problem - big problem
    //but in recursion we think about small problems
    //printing name 5 time is a big problem  whereas n-1 is a small program
    static void show(int num){
        //base case --> termination case
        if(num==0){
            return; //exit from the current function call
        }
        System.out.println("Ambika "+num);
        //num - 1; //small problem+recursion
        show(num-1);
        System.out.println("Kumari "+num);
    }
    public static void main(String[] args) {
        show(5);
    }
}
/*     
show(0)        
show(1)
show(2)
show(3)
show(4)
show(5)
main()
*/
