package Recursion;

import java.util.Scanner;

public class SumOfNumbers {
    //parameterized recursion
    static void sum(int i, int sum){
        if(i<1){
            System.out.println("Sum is "+sum);
            return;
        }
        sum(i-1, sum+i);
    }
    //functional recursion
    static int sum2(int n){
        if(n==0) return 0;
        return n + sum2(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        //SumOfNumbers.sum(n, 0);
        System.out.println(SumOfNumbers.sum2(n));
    }
}
