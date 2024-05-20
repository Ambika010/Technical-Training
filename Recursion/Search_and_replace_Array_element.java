import java.util.Arrays;
public class Search_and_replace_Array_element {
    static int[] searchAndReplace(int arr[], int index, int search, int replace){
        if(index==arr.length){
            return arr;
        }
        if(arr[index]==search){
            arr[index]=replace;
        }
        return searchAndReplace(arr, index+1, search, replace);
    }
    public static void main(String[] args) {
        int arr[]={10,20,50,40,60,50,50};
        int index=0;
        int search=50;
        int replace=500;
        int result[]=searchAndReplace(arr, index, search, replace);
        System.out.println(Arrays.toString(result));
    }
}
