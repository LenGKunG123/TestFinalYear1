import java.util.Scanner;

public class CollageManagementSystem {
    //    Write a console application named “CollegeManagementSystem” for a college to manage
//    information of students in the database. There are three types of students according to their
//    degrees in the application including bachelor’s students, master’s students, and Ph.D.
//    students. The application must have the following menu options.
    public static void main(String[] args) {
        String studentID, firstName, lastName, email, degree = null;
        Scanner input = new Scanner(System.in);
        School school = new School();
        int option = 0;
        int dg = 0;
        while (option != 5) {
            System.out.println(" ");
            System.out.println("Welcome to Student Management System");
            System.out.println("1. Add a new student");
            System.out.println("2. Delete the existing student");
            System.out.println("3. Display all student detail");
            System.out.println("4. Search a student detail");
            System.out.println("5. Exit");
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
                    while (dg != 4) {
                        System.out.println("Select your degree: ");
                        System.out.println("1. Bachelor");
                        System.out.println("2. Master");
                        System.out.println("3. Phd");
                        System.out.println("4. Exit");
                        dg = input.nextInt();
                        switch (dg){
                            case 1:
                                degree = "Bachelor";
                                Student student = new Student(studentID, firstName, lastName, email, degree);
                                school.addStudent(student);
                                break;
                            case 2:
                                degree = "Master";
                                Student student2 = new Student(studentID, firstName, lastName, email, degree);
                                school.addStudent(student2);
                                break;
                            case 3:
                                degree = "Phd";
                                Student student3 = new Student(studentID, firstName, lastName, email, degree);
                                school.addStudent(student3);
                                break;
                            case 4:
                                System.out.println("Exit");
                                break;
                        }
                    }
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

