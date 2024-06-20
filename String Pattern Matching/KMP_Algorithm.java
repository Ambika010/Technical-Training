// KMP - Knuth Morris Pratt

public class KMP_Algorithm {
    public static void main(String[] args) {
        String text = "abxabcabcabz";
        String pattern = "abcabz";
        int patternLength = pattern.length();
        int lps[] = new int[patternLength]; // LPS - longest prefix suffix
        lps[0] = 0; // because there is no prefix initially
        int length = 0;
        int i = 1;
        // Filling LPS Array
        // TC and SC for LPS array = O(N)
        while(i < patternLength) {
            if(pattern.charAt(i)==pattern.charAt(length)){
                length++;
                lps[i] = length;
                i++;
            }
            else{
                if(length != 0){
                    length = lps[length-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        // now do the pattern matching
        i = 0; // for text
        int j = 0; // for pattern
        while(i < text.length()){
            if(pattern.charAt(j)==text.charAt(i)){
                i++;
                j++;
            }
            if(j==patternLength){
                System.out.println("Pattern Found at index "+(i-j));
                j = lps[j-1];
            }
            else if(i < text.length() && pattern.charAt(j)!=text.charAt(i)) {
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
    }
}
