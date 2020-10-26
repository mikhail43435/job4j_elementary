package test.java.main.oop.encapsulation;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivan Ivanovich Ivanov");
        student.setGroup("234");
        student.setDate("01.02.2016");
        String print = "Student's full name: " + student.getFullName() + System.lineSeparator()
                + "Group: " + student.getGroup() + System.lineSeparator()
                + "Entry Date: " + student.getDate();
        System.out.println(print);

    }
}
