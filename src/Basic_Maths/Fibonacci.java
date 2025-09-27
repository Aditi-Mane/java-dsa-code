package Basic_Maths;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    //print fibonacci till n
    static void fibonacci(int n){
        List<Integer> ls = new ArrayList<>();
        ls.add(0);
        ls.add(1);
        int i=2;
        while(true){
            int next = ls.get(i-1)+ ls.get(i-2);
            if(next>n) break;
            ls.add(next);
            i++;
        }
        System.out.println("Fibonacci numbers till n: "+ls);
    }
    //print first n fibonacci numbers
    static void fibonacci2(int n){
        List<Integer> ls = new ArrayList<>();
        ls.add(0);
        ls.add(1);
        for(int i=2;i<=n;i++){
            ls.add(ls.get(i-1)+ls.get(i-2));
        }
        System.out.println("First n fibonacci numbers: "+ls);
    }
    //print the nth fibonacci number
    static void fibonacci3(int n){
        List<Integer> ls = new ArrayList<>();
        ls.add(0);
        ls.add(1);
        for(int i=2;i<=n;i++){
            ls.add(ls.get(i-1)+ls.get(i-2));
        }
        System.out.println("The nth fibonacci number is: "+ls.get(n));
    }
    //print first n fibonacci numbers
    public static void main(String[] args) {
        Fibonacci.fibonacci(10);
        Fibonacci.fibonacci2(10);
        Fibonacci.fibonacci3(10);
    }
}
