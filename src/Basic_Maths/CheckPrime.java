package Basic_Maths;

public class CheckPrime {
    //method 1: brute force - time complexity: O(n)
    public static boolean prime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if (n % 2 == 0) return false;

        for(int i=3; i<=Math.sqrt(n) ; i=i+2 ) {
            if(n % i == 0 ) return false;
        }
        return true;
    }
    //method 2: optimized
    public static boolean prime2(int n){
        int countFact = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                countFact++;
            }
        }
        return countFact == 2;
    }
    //method 3: even more optimized - time complexity: O(sqrt(n))
    public static boolean prime3(int n){
        int countFact = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                countFact++;
                if((n/i)!=i){
                    countFact++;
                }
            }
        }
        return countFact == 2;
    }
    public static void main(String[] args) {
        boolean primeNum = CheckPrime.prime3(37);
        if(primeNum){
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
