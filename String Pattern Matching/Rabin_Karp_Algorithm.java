// more improvised than naive pattern searching
// Logic :
// first compute the hash values of characters in pattern
// then we compute the hash values of current portion of characters in the text
// if the hash values matches then we compare character by character because abc, bac, cab, etc all will have same hash values
// if the hash values are not same we slide further 
// thus, in this algo we go for comparison of characters only when the hash values are same but in naive pattern searching we each time go for comparison of characters
// we also do modulus of hash values with a prime number so that the hash values remain within the given range

public class Rabin_Karp_Algorithm {
    public static void main(String[] args) {
        String text = "xweabcdefbcaserabccababc";
        String pattern = "abc";
        int textHash = 0;
        int patternHash = 0;
        // int primeRange = 101; // when the hash values comes out of range i.e. overflow errors may occur
        // firstly we compute the hash of pattern and also the hash of initial text whose length is equal to length of the pattern (in this case it considers xwe)
        for(int i=0; i<pattern.length(); i++){
            int ascii = pattern.charAt(i); // gives the ascii value of each character in pattern i.e. converts character to int values ('a'=97, 'b'=98, 'c'=99)
            patternHash = patternHash + ascii; // 97 + 98 + 99
            textHash = textHash + text.charAt(i);
        }
        // slide the pattern on top of the text
        for(int i=0; i<=text.length()-pattern.length(); i++){
            // when textHash matches the patternHash
            if(textHash == patternHash){
                // after the hash values matches, now compare the values character by character
                if(text.substring(i, i+pattern.length()).equals(pattern)){
                    System.out.println("Pattern Fount at index "+i);
                }
            }
            // now compute the next hash i.e. for next set of characters from the text (also known as rolling hash)
            if(i<text.length()-pattern.length()) {
                textHash = textHash - text.charAt(i) + text.charAt(i+pattern.length());
            }
        }
    }
}

// superious hits : when the hash values of pattern and text are equal but the character in the text is not in the same order as in the pattern
// like in this case pattern is abc : but when we get cab, bac, acb, etc in the text
// so when there is superious hits, time complexity is worst as for loop gets executed

// Time complexity when there is no superious hits : O(m+n)
// Time complexity when there is superious hits : O(m*n)
// where m is length of text and n is length of pattern
