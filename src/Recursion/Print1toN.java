//print linearly from 1 to N
package Recursion;

import java.util.Scanner;

public class Print1toN {
    static void printNum(int i, int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        printNum(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Till which number do you want to print? : ");
        int n =sc.nextInt();
        Print1toN.printNum(1, n);
    }
}
