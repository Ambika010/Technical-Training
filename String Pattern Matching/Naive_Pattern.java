// Naive Pattern Algorithm is the easiest algo for String Pattern Matching
// Slides Pattern one by one on each letter over the given text
// Logic : 
// get first character of text
// compare it with first character of pattern
// move to next character

public class Naive_Pattern {
    public static void main(String[] args) {
        String text = "abcdeghiftpyabc";
        String pattern = "abc";
        for(int i=0; i<=text.length()-pattern.length(); i++){
            int j=0;
            for(; j<pattern.length(); j++) {
                if(text.charAt(i+j) != pattern.charAt(j)){
                    break;
                }
            }
            if(j == pattern.length()) {
                System.out.println("Pattern Found at index "+i);
            }
        }
    }
}

// Time Complexity -  O((Text-Pattern)*Pattern)
// let, Text - Pattern = N
// let, Pattern = M
// TC = O((N-M)*M)

// Advantage - it is easiest to understand
// Disadvantage - if we have a text - "AAAAAAAAAAAAAAAAAAAAAAAC" and we need to find the pattern - "AAAAAAC", then in this case it starts from 0th index and it will match 6A's but will unable to get C then it will go back and start from 1st index and the process will continue for many such iterations which increases the time complexity
// Thus, we need to have a better solution