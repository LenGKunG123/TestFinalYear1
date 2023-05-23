import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testNo4 {
    public static void main(String[] args) {
//Write a Java program that uses a loop to read three Student3 objects from the binary file
//named “exam3.dat” into an array and calculates the average score to show on the console.
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("exam3.dat"));
            Student3[] student3s = new Student3[3];
            for (int i = 0; i < student3s.length; i++) {
                student3s[i] = (Student3) input.readObject();
            }
            System.out.println("Average score: " + student3s[0].getScore() + student3s[1].getScore() + student3s[2].getScore() / student3s.length);
            input.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public void averageScore(Student3[] student3s) {
        double sum = 0;
        for (int i = 0; i < student3s.length; i++) {
            sum += student3s[i].getScore();
        }
        System.out.println("Average score: " + sum / student3s.length);
    }
}
