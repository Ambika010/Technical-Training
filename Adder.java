//making commands
public class Adder {
    public static void main(String[] args) {
        int sum = 0;
        // for(int i=0;i<args.length;i++){
        //     sum = sum + Integer.parseInt(args[i]);
        // }
        for(String a:args){ //for each loop or enhanced for loop
            sum = sum + Integer.parseInt(a);
        }
        System.out.println(sum);
    }
}
//java adder 10 20 30 
//java adder
//java adder 10 20 30 40 50


//batch programming / shell programming
