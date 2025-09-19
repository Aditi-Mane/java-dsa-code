package Basic_Maths;

public class CheckPrime {
    public static boolean prime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if (n % 2 == 0) return false;

        for(int i=3; i<=Math.sqrt(n) ; i=i+2 ) {
            if(n % i == 0 ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        boolean primeNum = CheckPrime.prime(3);
        if(primeNum){
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
