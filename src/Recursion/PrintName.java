//print name n times
package Recursion;

import java.util.Scanner;

public class PrintName {
    //start from i and end when i>n
    static void print(int i, int n) {
        //base condition: when to stop
        if(i > n){
            return;
        }
        System.out.println("Aditi");
        print(i+1, n); //recall function with increment of i
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times you want your name printed: ");
        int n = sc.nextInt();
        PrintName.print(1,n);
    }
}
