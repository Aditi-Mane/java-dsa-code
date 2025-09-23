package Basic_Maths;

public class GCD {
    //method 1: time complexity - O(min(a,b))
    public static int findGcd(int a, int b){
        int minNum = Math.min(a, b), gcd = 0;
        for(int i=1;i <= minNum; i++){
            if(a%i == 0 && b%i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    //method 2: Euclidean algorithm - O(log phi min(a,b))
    public static int findGcd2(int a, int b){
        while(a > 0 && b > 0){
            if(a>b){
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if(a == 0){
            return b;
        } else {
            return a;
        }
    }
    public static void main(String[] args) {
        int gcd = GCD.findGcd2(12, 9);
        System.out.println("GCD/HCF is " + gcd);
    }
}
