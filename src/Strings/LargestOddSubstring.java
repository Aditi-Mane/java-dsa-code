package Strings;

//TC: O(n); SC: O(n)
public class LargestOddSubstring {
    static String largestOdd(String num){

        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i) - '0') % 2 != 0){
                String oddNum = num.substring(0,i+1);

                int firstNonZero = 0;
                for(int j=0;j<oddNum.length();j++){
                    if(oddNum.charAt(j) != '0'){
                        firstNonZero = j;
                        break;
                    }
                }
                return oddNum.substring(firstNonZero);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String num = "000000000214638";
        String largest = largestOdd(num);
        System.out.println(largest);
    }
}
