public class Check_Sorted_Array_Or_Not {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
            }
        }
        System.out.println((isSorted)?"Array is Sorted" : "Array is not Sorted");
    }
}
