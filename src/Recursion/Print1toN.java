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
    //via. backtracking
    static void printNum2(int i, int n){
        if(i<1) return;
        printNum2(i-1,n); //function runs until stop condition reaches
        System.out.print(i+" "); //this statement runs in backward flow as stack is emptied
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Till which number do you want to print? : ");
        int n =sc.nextInt();
        //Print1toN.printNum(1, n);
        Print1toN.printNum2(n, n);
    }
}
