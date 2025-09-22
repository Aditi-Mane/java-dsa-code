package Basic_Maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDivisors {
    //method 1: brute force
    public static void divisors(int n){
        for(int i=1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    //method 2: mathematical observation - using List
    public static void divisors2(int n){
        List<Integer> ls = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){

            if(n%i==0){
                ls.add(i);
                if((n/i)!=i){
                    ls.add(n/i);
                }
            }
        }
        Collections.sort(ls);
        for(int num: ls){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        PrintDivisors.divisors2(36);
    }
}
