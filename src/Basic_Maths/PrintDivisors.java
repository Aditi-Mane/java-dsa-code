package Basic_Maths;

public class PrintDivisors {
    public static void divisors(int n){
        for(int i=1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        PrintDivisors.divisors(36);
    }
}
