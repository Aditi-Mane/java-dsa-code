package OOP_practise.Inheritance.Single_Inheritance;

class Person {
    public String name;
    public int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.println("Name is "+name+", age is "+ age);
    }
    void success(){
        System.out.println("Everything has successfully been displayed");
    }
}
class Employee extends Person {
    public int salary;

    Employee(String name, int age, int salary){
        super(name, age);
        this.salary = salary;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Salary is "+salary);
    }
}
class Main{
    public static void main(String[] args) {
        Employee e = new Employee("Aditi", 21, 1000000);
        e.displayInfo();
        e.success();
    }
}
