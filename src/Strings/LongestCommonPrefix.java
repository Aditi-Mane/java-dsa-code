package Strings;

// TC: O(n*m) -> n representing number of words, m as length of shortest word
// SC: O(1) auxiliary space -> Output space: O(m) where m is the length of the common prefix
public class LongestCommonPrefix {

    static String prefix(String[] words) {
        if (words.length == 0) return "";

        String baseWord = words[0];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < baseWord.length(); i++) {
            char current = baseWord.charAt(i);

            for (int j = 1; j < words.length; j++) {
                if (i >= words[j].length() || words[j].charAt(i) != current) {
                    return sb.toString();
                }
            }
            sb.append(current);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println(prefix(words));
    }
}
