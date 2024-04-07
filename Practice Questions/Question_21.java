//Find frequency of each digit in a number

import java.util.HashMap;
public class Question_21 {
    public static void main(String[] args) {
        int num=724272;
        //hash map where both key and values are integer 
        HashMap<Integer,Integer> map=new HashMap<>();
        while(num!=0){
            int lastDigit=num%10;
            //when digit is not present in the map
            if(map.get(lastDigit)==null){ //get(key) 
                map.put(lastDigit, 1); //put(key, value) where key is the unique digits in num and value is the number times the digits are appearing in num i.e. frequency
            }
            //when the digit is already present in the map
            else{
                int count = map.get(lastDigit); //this will give the current fequency of the current digit
                count++; //increment the count
                map.put(lastDigit, count); //key humesha unique hoti hai, toh previous key ko overwrite kr dega new count value ke sath
            }
            num=num/10;
        }
        System.out.println(map);
    }
}
