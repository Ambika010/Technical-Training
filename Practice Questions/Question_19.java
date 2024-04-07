//even and odd place sum of digit
//num:8765
//on position 1, 5 is present
//on position 2, 6 is present
//on position 3, 7 is present
//on position 4, 8 is present
//so odd place sum = 5+7 = 12
//and even place sum = 6+8 = 14 
public class Question_19 {
    public static void main(String[] args) {
        int num=86754;
        int pos=0;
        int even=0, odd=0;
        while(num!=0){
            int rem=num%10;
            pos++;
            if(pos%2==0){
                even=even+rem;
            }else{
                odd=odd+rem;
            }
            num=num/10;
        }
        System.out.println("Sum of even places digits = "+even);
        System.out.println("Sum of odd places digits = "+odd);
    }
}

//
//positions --> 1 2 3 4 5
//   number --> 8 6 7 5 4