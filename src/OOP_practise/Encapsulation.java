package OOP_practise;

public class Encapsulation {
    private String name;
    private int marks;

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks){
        if(marks < 0){
            System.out.println("Marks cannot be negative");
        } else {
            this.marks = marks;
        }
    }

    public void setName(String name) {
        if(name.length() < 3){
            System.out.println("Minimum characters required are 3");
        } else {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Encapsulation i = new Encapsulation();
        i.setName("Aditi");
        System.out.println("Name is " + i.getName());

        i.setMarks(78);
        System.out.println("Marks are " + i.getMarks());
    }
}
