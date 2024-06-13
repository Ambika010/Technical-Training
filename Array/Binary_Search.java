// array should be sorted in case of binary search

public class Binary_Search {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int low = 0;
        int high = arr.length-1;
        int search = 10;
        while(low<=high){
            int mid = (low+high)/2;
            if(search == arr[mid]){
                System.out.println("Element Found at index "+mid);
                return; // exit from the main function
            }else if(search>arr[mid]){
                low = mid + 1; // move to the right
            }else if(search<arr[mid]){
                high = mid - 1; // move to the left
            }
        }
        System.out.println("Element not found...");
    }
}
