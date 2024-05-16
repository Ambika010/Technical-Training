/*
count even and odd number between 1 to N
try with both void and storing result in an array and then returning the array
*/
import java.util.Arrays;

public class Count_Even_Odd_num {
    static void countEvenOdd(int range, int evenCount, int oddCount){
        if(range==0){
            System.out.println(evenCount +" "+ oddCount);
            return;
        }
        if(range%2==0){
            evenCount++;
        }else{
            oddCount++;
        }
        countEvenOdd(range-1, evenCount, oddCount);
    }
    static int[] countEvenOdd2(int range) {
        if(range==0){
            int arr[]=new int[2]; // initially, filled with 0
            return arr;
        }
        int arr[] = countEvenOdd2(range-1);
        if(range%2==0){
            arr[0]++; // 0th index has even count
        }else{
            arr[1]++; // 1st index has odd count
        }
        return arr;
    }
    public static void main(String[] args) {
        countEvenOdd(11, 0, 0);
        int result[] = countEvenOdd2(15);
        System.out.println(Arrays.toString(result));
    }
}
