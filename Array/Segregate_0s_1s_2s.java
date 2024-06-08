import java.util.Arrays;

// https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

/*
read to understand the logic of the question
https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
*/

public class Segregate_0s_1s_2s {
    public static void sort012(int a[], int n){
        int low=0;
        int mid=0;
        int high=n-1;
        int temp=0;
        while(mid<=high){
            switch(a[mid]){
                case 0:
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break; 
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 0, 2, 1, 0, 2};
        sort012(a, a.length);
    }
}
