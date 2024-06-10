// https://www.geeksforgeeks.org/problems/nuts-and-bolts-problem0431/1

import java.util.Arrays;
import java.util.HashSet;

public class Nuts_And_Bolts_Problem {
    private static final char[] order = {'!', '#', '$', '%', '&', '*', '?', '@', '^'};
    public static void matchPairs(int n, char nuts[], char bolts[]) {
        HashSet<Character> boltsSet = new HashSet<>();
        for(int i=0; i<n; i++){
            boltsSet.add(bolts[i]);
        }
        char sortedNuts[]=new char[n];
        int index=0;
        for (char c : order) {
            if (boltsSet.contains(c)) {
                sortedNuts[index++] = c;
            }
        }
        for(int i=0; i<n; i++){
            nuts[i]=sortedNuts[i];
        }
        for(int i=0; i<n; i++){
            bolts[i]=sortedNuts[i];
        }
        System.out.println("nuts : "+Arrays.toString(nuts));
        System.out.println("bolts : "+Arrays.toString(bolts));
    }
    public static void main(String[] args) {
        char nuts[] = {'@', '%', '$', '#', '^'};
        char bolts[] = {'%', '@', '#', '$', '^'};
        int n=5;
        matchPairs(n, nuts, bolts);
    }
}
