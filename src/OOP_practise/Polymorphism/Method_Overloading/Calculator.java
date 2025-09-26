package OOP_practise.Polymorphism.Method_Overloading;

public class Calculator {
    void add(int a, int b){
        System.out.println("Addition of two numbers: "+ (a+b));
    }

    void add(double a, double b){
        System.out.println("Addition of two double numbers: "+ (a+b));
    }

    void add(int a, int b, int c){
        System.out.println("Addition of three numbers: "+ (a + b + c));
    }
}

class Main{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(2, 3);
        c.add(2.5, 6.3);
        c.add(2, 5, 7);
    }
}