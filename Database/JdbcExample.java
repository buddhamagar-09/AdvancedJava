import java.sql.*;
// import java.awt.*;
// import javax.swing.*;

// import javax.swing.JOptionPane;

public class JdbcExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_bca3";
        String user = "root";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM students");
            ResultSet rs =  preparedStatement.executeQuery();

            while(rs.next())
            {
                System.out.println(rs.getString("Name"));
                System.out.println(rs.getString("Email"));
                System.out.println(rs.getString("Password"));
                System.out.println(rs.getString("Address"));
            }

            // System.out.println("Connected to the database!");
          
        } catch (Exception e) {
        //   JOptionPane.showMessageDialog(parent, "Couldnt connect to the dataBase" + e.getMessage());
        System.out.println("Couldnt connect to the database");
        }
    }
}