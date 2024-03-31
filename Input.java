import java.io.IOException;
import java.util.*;
public class Input {
    public static void main(String[] args) throws IOException{
        // at a time only one input
        // data comes as a byte datatype
        // int singleValue = System.in.read(); //in is the object of inputStream (throws IOexception)
        // byte w[] = System.in.readAllBytes(); //considers all input but does not know where to stop taking the inputs
        // System.out.println(singleValue);
        int count = 0;
        //Scanner sc = new Scanner(System.in); //there 14 different sources to use scanner (system.in is one of them)
        //two methods with scanner
        //scanner.nextXXX(); - word by word
        //scanner.nextLIne(); line by line
        Scanner sc = new Scanner("Hello how are you");
        while(sc.hasNext()){ //buffer has next value till then loop works, this is known as iterators
            //System.out.println(sc.next());
            sc.next();
            count++;
        }
        System.out.println("no. of words = "+count);;
        sc.close(); //if scanner not closed then there is a memory leakage problem
    }
}
