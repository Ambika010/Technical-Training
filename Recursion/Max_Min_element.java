import java.util.Arrays;
public class Max_Min_element {
    static int[] getMinMax(int arr[], int index){
        if(index==arr.length){
            int[] r=new int[2];
            r[0]=Integer.MAX_VALUE;
            r[1]=Integer.MIN_VALUE;
            return r;
        }
        int[] result=getMinMax(arr, index+1);
        if(result[0]>arr[index]){
            result[0]=arr[index];
        }
        else if(result[1]<arr[index]){
            result[1]=arr[index];
        }
        return result;
    }
    public static void main(String[] args) {
        int array[]={10,90,100,200,50,1,88,60};
        int result[]=getMinMax(array,0);
        System.out.println(Arrays.toString(result));
    }
}