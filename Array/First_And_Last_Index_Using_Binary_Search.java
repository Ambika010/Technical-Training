public class First_And_Last_Index_Using_Binary_Search {
    public static void main(String[] args) {
        // Find the first and the last index of 33
        // also find the total occurence of 33
        int arr[] = {1, 5, 10, 15, 20, 33, 33, 33, 33, 40, 42, 52, 62, 72};
        int search = 33;
        int firstIndex = -1;
        int lastIndex = -1;
        int low = 0;
        int high = arr.length-1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(search == arr[mid]) {
                // Assume this would be the first index 
                firstIndex = mid;
                // first index will get on the left side where as the last index will get on the right side
                high = mid - 1; // searching ki mid se left mei bhi 33 present hai ya nahi
            } else if (search > arr[mid]){
                low = mid + 1;
            }else if (search < arr[mid]) {
                high = mid -1;
            }
        }
        System.out.println("First index : "+firstIndex);
        low = 0;
        high = arr.length-1;
        while(low <= high) {
            int mid = (low+high)/2;
            if(search == arr[mid]) {
                // Assume this would be the last index 
                lastIndex = mid;
                // first index will get on the left side where as the last index will get on the right side
                low = mid + 1; // searching ki mid se right mei bhi 33 present hai ya nahi
            } else if (search > arr[mid]){
                low = mid + 1;
            }else if (search < arr[mid]) {
                high = mid -1;
            }
        }
        System.out.println("Last index : "+lastIndex);
        int totalOccurence = lastIndex - firstIndex + 1;
        System.out.println("Total Occurence : "+totalOccurence);
    } 
}
