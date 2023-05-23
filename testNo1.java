import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class testNo1 {

    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("exam1.txt");
            pw.println("65130500031");
            pw.println("Nateetarn Likitwiwatphong");
            pw.println("19");
            pw.println("178");
            pw.println("70");
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
