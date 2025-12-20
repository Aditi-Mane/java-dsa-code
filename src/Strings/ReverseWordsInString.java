package Strings;

//TC: O(n); SC: O(n)
public class ReverseWordsInString {
    static String reverse(String s){
        String[] words = s.trim().split("\\s+");
        int start = 0, end = words.length-1;
        while(start<end){
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        String s = "   The      sky    is      blue      ";
        String reversed = reverse(s);
        System.out.println(reversed);
        if(reversed.equals(s)){
            System.out.println("is palindrome");
        } else {
            System.out.println("is not palindrome");
        }
    }
}

