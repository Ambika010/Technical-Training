// https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    static ArrayList<Integer> leaders(int arr[], int n){
        int leader = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=leader){
                leader = arr[i];
                list.add(leader);
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        System.out.println(leaders(arr, arr.length));
    }
}
