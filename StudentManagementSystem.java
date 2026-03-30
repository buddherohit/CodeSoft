package Task5_StudentManagement;

import java.util.*;

public class StudentManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    removeStudent(sc);
                    break;

                case 3:
                    searchStudent(sc);
                    break;

                case 4:
                    displayAll();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }

    // Add Student
    public static void addStudent(Scanner sc) {
        System.out.print("Enter name: ");
        sc.nextLine(); // buffer clear
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter grade: ");
        String grade = sc.next();

        students.add(new Student(name, roll, grade));
        System.out.println(" Student added successfully!");
    }

    // Remove Student
    public static void removeStudent(Scanner sc) {
        System.out.print("Enter roll number to remove: ");
        int roll = sc.nextInt();

        Iterator<Student> it = students.iterator();
        boolean found = false;

        while (it.hasNext()) {
            Student s = it.next();
            if (s.getRollNo() == roll) {
                it.remove();
                found = true;
                System.out.println(" Student removed!");
                break;
            }
        }

        if (!found) {
            System.out.println(" Student not found!");
        }
    }

    // Search Student
    public static void searchStudent(Scanner sc) {
        System.out.print("Enter roll number to search: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.getRollNo() == roll) {
                s.display();
                return;
            }
        }

        System.out.println(" Student not found!");
    }

    // Display All
    public static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }
}