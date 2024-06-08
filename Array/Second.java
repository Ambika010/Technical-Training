import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Second {
    public static void main(String[] args) {
        // Static vs Dynamic Array
        int arr[] = new int[10]; // static array 

        // Dynamic Array
        // when capacity is increased old array is copied in the new one (with increased capacity)
        // internally uses array i.e. arraylist is just a wrapper in top of normal array
        // list is an interface whose implementation is presemt with ArrayList, Vector, LinkedList
        // object arraylist ka bnate hai lekin isko cast list mei kr dete
        // jb hum arraylist ko vector mei switch karte hai toh code mei changes nhi honge in this case
        List<Integer> list = new ArrayList<>(); // upcasting (list --> array list)
        list = new Vector<>(); // we can do this if we are doing upcasting but if we use only array list we cannot convert it to vector we can only use array list in that case
        for(int i = 1; i<=20; i++){
            list.add(i);
        }
        System.out.println(list);
    }
}
