package Basic_Maths;

import static java.lang.Math.log10;

public class ArmstrongCheck {
    public static void solve(int n){
        int temp = n;
        int armNum = 0;
        int count = (int) (log10(n) + 1);
        while(n != 0){
            int lastDigit = n % 10;
            armNum = armNum + (int) Math.pow(lastDigit, count);
            n = n / 10;
        }
        if(armNum == temp){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
    public static void main(String[] args) {
        ArmstrongCheck.solve(54748);
    }
}

