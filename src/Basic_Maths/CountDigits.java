package Basic_Maths;

import static java.lang.Math.log10;
//time complexity: log10(n) since iterations based on division

public class CountDigits {
    public static int digit(int n){
        int count = 0, lastDigit;
        //method 1: traditional method
        while(n>0){
            lastDigit = n % 10;
            count++;
            n = n / 10;
        }
        //method 2: optimizing it a bit
//        while(n>0){
//            count++;
//            n = n / 10;
//        }
        //method 3: using mathematics
//        count = (int) (log10(n) + 1);
        return count;
    }
    public static void main(String[] args) {
        int count = CountDigits.digit(2345923);
        System.out.println(count);
    }
}
