//print linearly from N to 1
package Recursion;

import java.util.Scanner;

public class PrintNto1 {
    static void printNum(int i, int n){
        if(n<i){
            return;
        }
        System.out.print(n+" ");
        printNum(i, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print from till 1: ");
        int n =sc.nextInt();
        PrintNto1.printNum(1, n);
    }
}
