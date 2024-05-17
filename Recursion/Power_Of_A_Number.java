public class Power_Of_A_Number {
    static void calculatePower(int num, int power, int result) {
        if(power == 0){
            System.out.println(result);
            return;
        }
        result = result*num;
        calculatePower(num, power-1, result);
    }
    static int calculatePower2(int num, int power) {
        if(power == 0){
            return 1;
        }
        int result = calculatePower2(num, power-1);
        result = result*num;
        return result;
    }
    public static void main(String[] args) {
        calculatePower(2, 5, 1);
        System.out.println(calculatePower2(2, 6));
    }
}
