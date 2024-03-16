
public class DataTypes {
    public static strictfp void main(String[] args) {
        //primitive datatypes are immutable in nature (primary value type)
        int age = 22; //creates a new memory for each variable and stores its value
        int age1 = age; //in this case the value of variable age is copied in the variable age1
        System.out.println(age+1); //creates a new memory for age1 (immutable - original value is not disturbed)
        System.out.println(age);
        //reference datatype (secondary or mutable value type) (Types - String/Stringbuffer/Stringbuilder, Wrapper, Big)
        Integer age2 = 23; //creates a memory add generates a address like pointers and points to the value of age2
        //char size in java = 2 byte bcz it works with unicoe while c lang works with ascii value only so char size there is 1 byte
        char g = 'न'; 
        System.out.println(g);
        //Non - decimal datatype : byte,short,int,long (size range formula = 2^r to 2^(r-1))
        //decimal datatype : float,double

        //strictfp : IEEE standard method is followed (this code will run in the same way in all machines)

        int a1 = 101; //numeric literal
        int a2 = 0123; //octal literal
        int a3 = 0x12A; //hexa literal
        int a4 = 0b1010; //binary literal
    }
}
