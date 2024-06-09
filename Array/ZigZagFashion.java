// https://www.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1

import java.util.Arrays;
public class ZigZagFashion {
    public static void zigZag(int n, int[] arr) {
        // a < b > c
        boolean flag = true;
        for(int i=0; i<n-1; i++){
            if(flag){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            if(!flag){
                if(arr[i]<arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag = !flag;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 7, 8, 6, 2, 1};
        zigZag(arr.length, arr);
    }
}
