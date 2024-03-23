public class Sort_Array {
    static boolean checkSorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return checkSorted(arr, index+1);
    }
    static void isSorted(int[] arr, int index){
        if(index==arr.length-1){
            System.out.println("Array is Sorted");
            return;
        }
        if(arr[index]>arr[index+1]){
            System.out.println("Array is not Sorted");
            return;
        }
        isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int index=0;
        System.out.println(checkSorted(arr, index));
        isSorted(arr,index);
    }
}
