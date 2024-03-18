public class Count_zeros {
    static void countZeros(int num,int count){
        if(num==0){
            System.out.println("number of zeros : "+count);
            return;
        }
        int r=num%10;
        if(r==0){
            count++;
        }
        countZeros(num/10, count);
    }
    public static void main(String[] args) {
        countZeros(1020300, 0);
    }
}
