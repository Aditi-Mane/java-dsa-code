package Strings;

//TC: O(n); SC: O(n)
public class ReverseString {
    static String reverse(String s){
        int start = 0, end = s.length()-1;
        char[] ch = s.toCharArray();
        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String s = "Aditi Mane";
        String reversed = reverse(s);
        System.out.println(reversed);
    }
}
