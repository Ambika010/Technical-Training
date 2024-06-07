public class First_and_Second_Largest {
    public static void main(String[] args) {
        int arr[] = {100, 100, 110, 90, 20, 98, 102};
        int largest = 0;
        int sec_largest = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sec_largest && arr[i]<largest){
                sec_largest = arr[i];
            }
        }
        
        System.out.println("largest element = "+largest);
        System.out.println("second largest element = "+sec_largest);
    }
}
