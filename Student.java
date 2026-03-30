package Task5_StudentManagement;

public class Student {
    private String name;
    private int rollNo;
    private String grade;

    public Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Grade: " + grade);
    }
}
