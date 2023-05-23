import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        String studentID, firstName, lastName, email, degree;
        Scanner input = new Scanner(System.in);
        School school = new School();
        int option = 0;
        while (option != 5) {
            System.out.println(" ");
            System.out.println("Welcome to Student Management System");
            System.out.println("1. Add a new student");
            System.out.println("2. Delete the existing student");
            System.out.println("3.Display all student detail");
            System.out.println("4. Search a student detail");
            System.out.println("5. Exit");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Enter your option: ");

            option = input.nextInt();
            System.out.println(" ");
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter student ID: ");
                    studentID = input.nextLine();
                    System.out.println("Enter first name: ");
                    firstName = input.nextLine();
                    System.out.println("Enter last name: ");
                    lastName = input.nextLine();
                    System.out.println("Enter email: ");
                    email = input.nextLine();
                    System.out.println("Enter degree: ");
                    degree = input.nextLine();
                    Student student = new Student(studentID, firstName, lastName, email, degree);
                    school.addStudent(student);
                    break;
                case 2:
                    System.out.println("Enter student ID: ");
                    studentID = input.nextLine();
                    school.removeStudent(studentID);
                    break;
                case 3:
                    school.displayStudentDetails();
                    break;
                case 4:
                    System.out.println("Enter student ID: ");
                    studentID = input.nextLine();
                    school.searchStudent(studentID);
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
            }
        }
    }
}
