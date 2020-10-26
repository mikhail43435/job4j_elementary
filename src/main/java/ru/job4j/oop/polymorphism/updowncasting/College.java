package test.java.main.oop.polymorphism.updowncasting;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object obj = student;

        System.out.println(freshman);
        System.out.println(student);
        System.out.println(obj);
    }
}
