package Recursion;

import java.util.Scanner;

public class FactorialOfNumbers {
    //parameterized recursion
    static void fact(int i, int n){
        if(i<1){
            System.out.println("Factorial is "+n);
            return;
        }
        fact(i-1, n*i);
    }
    //functional recursion
    static int fact2(int n){
        if(n==1) return 1;
        return n * fact2(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        FactorialOfNumbers.fact(n, 1);
        System.out.println(FactorialOfNumbers.fact2(n));
    }
}
