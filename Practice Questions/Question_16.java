//check Even Odd
//There are 4 ways
public class Question_16 {
    //first 
    //using if - else
    static void isEvenOdd(int num){
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    //second
    //using bitwise XOR
    //logic --> if num=4, binary conversion=0100 => XORing 1 to it i.e. 0100 ^ 0001 = 0101(5 == 4+1)
    //          if num=5, binary conversion=0101 => XORing 1 to it i.e. 0101 ^ 0001 = 0100(4 == 5-1)
    //so when number is even, performing bitwise XOR with the number and 1 gives result as number+1
    //and when number is odd, performing bitwise XOR with the number and 1 gives result as number-1
    static void isEvenOdd1(int num){
        int x=1;
        int result=num^x;
        if(result==(num+1)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    //third
    //using bitwise AND
    //logic --> if num=4, binary conversion=0100 => ANDing 1 to it i.e. 0100 & 0001 = 0000 (0)
    //          if num=5, binary conversion=0101 => ANDing 1 to it i.e. 0101 & 0001 = 0001 (1)
    //so when number is even, performing bitwise AND with the number and 1 gives result as 0
    //and when number is odd, performing bitwise AND with the number and 1 gives result as 1
    static void isEvenOdd2(int num){
        int x=1;
        int result=num & x;
        if(result==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    //fourth
    //using bitwise OR
    //logic --> if num=4, binary conversion=0100 => ORing 1 to it i.e. 0100 | 0001 = 0101(5 == 4+1)
    //          if num=5, binary conversion=0101 => ORing 1 to it i.e. 0101 | 0001 = 0101(5 == num)
    //so when number is even, performing bitwise OR with the number and 1 gives result as number+1
    //and when number is odd, performing bitwise OR with the number and 1 gives result as the number itself
    static void isEvenOdd3(int num){
        int x=1;
        int result=num | x;
        if(result==(num+1)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        isEvenOdd(2);
        isEvenOdd1(3);
        isEvenOdd2(4);
        isEvenOdd3(5);
    }
}
