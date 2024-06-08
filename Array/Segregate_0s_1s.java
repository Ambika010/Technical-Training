import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1

public class Segregate_0s_1s {
    static void segregate0and1(int[] arr, int n) {
        // Arrays.sort(arr); 

        //OR

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0; i<count; i++){
            arr[i]=0;
        }
        for(int i=count; i<arr.length; i++){
            arr[i]=1;
        }
        System.out.println(Arrays.toString(arr));
        
        //OR

        /*
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            while(start<end && arr[start]==0){
                start++;
            }
            while(start<end && arr[end]==1){
                end--;
            }
            if(start<end){
                arr[start]=0;
                arr[end]=1;
                start++;
                end--;
            }
        }
        */
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 0, 1};
        segregate0and1(arr, arr.length);
    }
}
