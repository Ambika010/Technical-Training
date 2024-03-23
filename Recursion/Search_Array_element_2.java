import java.util.Arrays;
//search an element in array, find all ocurrances
//eg:[10,20,50,40,50]
//output --> [2,4]
//return all the found indexes
public class Search_Array_element_2 {
    static int[] isFoundAtIndexHelper(int arr[], int index, int search, int count){
        if(index==arr.length){
            int result[]=new int[count];
            return result;
        }
        // Stack Building
        if(arr[index]==search){
            count++;
        }
        int result[]=isFoundAtIndexHelper(arr, index+1, search, count);
        // Stack Fall
        if(arr[index]==search){
            result[count-1]=index;
        }
        return result;
    }
    static int[] isFoundAtIndex(int arr[], int index, int search){
        return isFoundAtIndexHelper(arr, index, search, 0);
    }
    public static void main(String[] args) {
        int arr[]={10,20,50,40,50,60,50,50};
        int search=50;
        int index=0;
        int result[]=isFoundAtIndex(arr, index, search);
        // for (int i = 0; i < result.length; i++) {
        //     System.out.println(result[i]);
        // }
        System.out.println(Arrays.toString(result));
    }
}