package Strings;

//TC: O(n); SC: O(n)
public class RemoveOuterParenthesis {
    static String remove(String s){
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                if(open>0) sb.append(ch);
                open++;
            } else {
                open--;
                if(open>0) sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        String newString = remove(s);
        System.out.println(newString);
    }
}
