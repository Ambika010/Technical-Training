import java.util.Arrays;

public class Count_even_odd_Digits {
    static void countOddEven(int num, int even, int odd){
        if(num==0){
            System.out.println("no. of even digits = "+even);
            System.out.println("no. of odd digits = "+odd);
            return;
        }
        int digit=num%10;
        if(digit%2==0){
            even++;
        }else{
            odd++;
        }
        countOddEven(num/10, even, odd);
    }
    static int[] countOddEven2(int num){
        if(num==0){
            int[] r=new int[2];
            return r;
        }
        int result[]=countOddEven2(num/10);
        int digit=num%10;
        if(digit%2==0){
            result[0]++; //0th index has even count
        }else{
            result[1]++; //1st index has odd count
        }
        return result;
    }
    public static void main(String[] args) {
        countOddEven(1234567, 0, 0);
        int num=1234567;
        int result[]=countOddEven2(num);
        System.out.println(Arrays.toString(result));
    }
}
