package OOP_practise.Abstraction.Abstract_Class;

abstract class Shape {
    abstract void draw();

    void shape(){
        System.out.println("Shapes are shaping");
    }
}
class Circle extends Shape {
    void draw(){
        System.out.println("Circle is being drawn");
    }
}
class Square extends Shape {
    void draw(){
        System.out.println("Square is being drawn");
    }
}
class Main{
    public static void main(String[] args) {
        Shape c = new Circle();
        c.draw();

        Shape s = new Square();
        s.draw();

        c.shape();
    }
}