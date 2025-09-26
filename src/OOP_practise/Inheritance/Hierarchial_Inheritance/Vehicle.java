package OOP_practise.Inheritance.Hierarchial_Inheritance;

class Vehicle {
    void start(){
        System.out.println("Vehicle starts...");
    }
}
class Car extends Vehicle {
    void drive(){
        System.out.println("Driving a car");
    }
}
class Bike extends Vehicle {
    void ride(){
        System.out.println("Riding a bike");
    }
}
class Main{
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();

        Bike b = new Bike();
        b.start();
        b.ride();
    }
}
