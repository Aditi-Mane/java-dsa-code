package Basic_Maths;

public class LCM {
    //method 1: brute force - what I thought of at first hehe:)
    public static int findLcm(int a, int b){
        int minNum = Math.min(a, b);
        int maxNum = Math.max(a, b);
        int lcm = 0;
        outerLoop:
        for(int i=2; i<=maxNum;){
            for(int j=1; j<=minNum;){
                if(i*minNum == j*maxNum){
                    lcm = j * maxNum;
                    break outerLoop;
                } else if(i*minNum < j*maxNum){
                    i++;
                    continue;
                } else if(i*minNum > j*maxNum){
                    j++;
                }
            }
        }
        return lcm;
    }
    //method 2: lcm = a*b / gcd(a,b)
    public static int findLcm2(int a, int b){
        int num1 = a;
        int num2 = b;
        while(a > 0 && b > 0){
            if(a>b){
                a = a % b;
            } else {
                b = b % a;
            }
        }
        int gcd = 0;
        if(a == 0){
            gcd = b;
        } else {
            gcd = a;
        }
        return (num1*num2)/gcd;
    }
    public static void main(String[] args) {
        int lcm = LCM.findLcm2(4, 6);
        System.out.println(lcm);
    }
}
