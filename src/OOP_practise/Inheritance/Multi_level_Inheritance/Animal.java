package OOP_practise.Inheritance.Multi_level_Inheritance;

class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
}
class Mammal extends Animal {
    void runs(){
        System.out.println("Mammal runs");
    }
}
class Dog extends Mammal {
    void sound(){
        System.out.println("Dog barks");
    }
}
class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.runs();
        d.eat();
    }
}
