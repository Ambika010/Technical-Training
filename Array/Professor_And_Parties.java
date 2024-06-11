// https://www.geeksforgeeks.org/problems/professor-and-parties2000/1

import java.util.HashMap;

public class Professor_And_Parties {
    public static String PartyType( long a[], int n){
        HashMap<Long, Boolean> map = new HashMap<>();
        for(long i:a){
            if(map.get(i)==null){
                map.put(i, true);
            } else{
                return "BOYS";
            }
        }
        return "GIRLS";
        
        // OR
        
        /*
        HashMap<Long, Long> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i])+1);
            }else{
                map.put(a[i], 1L);
            }
        }
        for(long value:map.values()){
            if(value>1){
                return "BOYS";
            }
        }
        return "GIRLS";
        */
    }
    public static void main(String[] args) {
        long a[] = {1, 2, 3, 4, 7};
        int n=5;
        System.out.println(PartyType(a, n));
    }
}
