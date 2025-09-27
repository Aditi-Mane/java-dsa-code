package Recursion;

public class PalindromeString {
    static boolean palindrome(String str, int i){
        char[] S = str.toCharArray();
        if(i>=str.length()/2) return true;
        if(S[i] != S[str.length()-i-1]) return false;
        return palindrome(str, i+1);
    }
    public static void main(String[] args) {
        if(PalindromeString.palindrome("MADAM", 0)){
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a palindrome String");
        }
    }
}
