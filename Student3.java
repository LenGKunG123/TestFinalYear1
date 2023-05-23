import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Student3 {
    //    Write a Java class named “Student3” to implement a Serializable interface with attributes
//    and methods as shown in class diagram below. Write a Java program that uses a loop to
//    get information for three students from the keyboard, create a Student3 object for each
//    student, and store them in a binary file named “exam3.dat”.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i != 4){
            System.out.println("Enter ID: ");
            int id = input.nextInt();
            System.out.println("Enter first name: ");
            String firstName = input.next();
            System.out.println("Enter last name: ");
            String lastName = input.next();
            System.out.println("Enter score: ");
            double score = input.nextDouble();
            if(i == 1) {
                Student3 student1 = new Student3(id, firstName, lastName, score);
                student1.outputStream(student1);
                i++;
            } else if (i == 2) {
                Student3 student2 = new Student3(id, firstName, lastName, score);
                student2.outputStream(student2);
                i++;
            } else if (i == 3){
                Student3 student3 = new Student3(id, firstName, lastName, score);
                student3.outputStream(student3);
                i++;
            }
        }

    }

    private int Id;
    private String firstName;
    private String lastName;
    private double score;

    public Student3(int Id, String firstName, String lastName, double score) {
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getScore() {
        return score;
    }

    public int getId() {
        return Id;
    }

    public void outputStream(Student3 student) {
        ObjectOutputStream output = null;
        try{
            output = new ObjectOutputStream(new FileOutputStream("exam3.dat"));
            output.writeObject(student);
            output.flush();
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}

