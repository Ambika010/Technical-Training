// https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_Of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(list.isEmpty() || list.get(list.size()-1)!=nums1[i]){
                    list.add(nums1[i]);
                }
                i++;
                j++;
            } else if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }
        }
        int result[] = new int[list.size()];
        for(int k=0; k<list.size(); k++){
            result[k]=list.get(k);
        }
        return result;
    }
    public static void main(String[] args) {
        int nums1[] = {1, 1, 2, 3, 3, 4, 5};
        int nums2[] = {1, 2, 3, 6};
        int result[] = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
