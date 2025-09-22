package Basic_Maths;

public class PrintDivisors {
    //method 1: brute force
    public static void divisors(int n){
        for(int i=1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    //method 2: mathematical observation
    public static void divisors2(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                if((n/i)!=i){
                    System.out.print(n/i+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintDivisors.divisors2(36);
    }
}
