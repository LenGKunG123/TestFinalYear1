import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class testNo2 {
//    Write a Java program to read your information from the text file named “exam1.txt” using
//    methods in the Scanner class and display your information on the console.

    public static void main(String[] args) {
        Scanner input;
        try {
            input = new Scanner(new FileReader("exam1.txt"));
            while (input.hasNext()) {
                String id = input.nextLine();
                String name = input.nextLine();
                int age = input.nextInt();
                int height = input.nextInt();
                int weight = input.nextInt();
                System.out.println("ID: " + id + "\nName: " + name + "\nAge: "
                        + age + "\nHeight: " + height + "\nWeight: " + weight);
            }
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
