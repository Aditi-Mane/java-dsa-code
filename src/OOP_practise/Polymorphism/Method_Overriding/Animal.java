package OOP_practise.Polymorphism.Method_Overriding;

public class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound(){
        System.out.println("Dog barks");
    }
}

class Main{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
