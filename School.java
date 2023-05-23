import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class School {
    private String schoolName;

    public School (){
    }
    public School(String schoolName) {
        this.schoolName = schoolName;
    }
    public void addStudent(Student student) {
        Connection connection = DatabaseConnect.connect();
        String sql = "INSERT INTO student (studentID, firstName, lastName, email, degree) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, student.getStudentID());
            preparedStatement.setString(2, student.getFirstName());
            preparedStatement.setString(3, student.getLastName());
            preparedStatement.setString(4, student.getEmail());
            preparedStatement.setString(5, student.getDegree());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void removeStudent(String studentID) {
        Connection connection = DatabaseConnect.connect();
        String sql = "DELETE FROM student WHERE studentID = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, studentID);
             preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void displayStudentDetails() {
        Connection connection = DatabaseConnect.connect();
        String sql = "SELECT * FROM student";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("studentID") + " " +
                        resultSet.getString("firstName") + " " +
                        resultSet.getString("lastName") + " " +
                        resultSet.getString("email") + " " +
                        resultSet.getString("degree"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void searchStudent (String studentID) {
        Connection connection = DatabaseConnect.connect();
        String sql = "SELECT * FROM student WHERE studentID = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, studentID);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next() == false) {
                System.out.println("No students in the database.");
            }
            while (resultSet.next()) {
                System.out.println(resultSet.getString("studentID") + " " +
                        resultSet.getString("firstName") + " " +
                        resultSet.getString("lastName") + " " +
                        resultSet.getString("email") + " " +
                        resultSet.getString("degree"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Student getStudent(String studentID) {
        Connection connection = DatabaseConnect.connect();
        String sql = "SELECT * FROM student WHERE studentID = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, studentID);
            preparedStatement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;

    }

}
