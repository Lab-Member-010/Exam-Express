package ITEP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login1{

    public boolean authenticateUser(String username, String password, String userType) {
        try {
            Conn1 c = new Conn1();  // Database connection
           // Connection connection = conn.getConnection();

            String query;
            if ("Student".equals(userType)) {
                query = "SELECT * FROM user WHERE Email = ? AND password = ?";
            } else {
                query = "SELECT * FROM staff WHERE gamil = ? AND password = ?";
            }

            PreparedStatement pst = c.c.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return true; // User authenticated
            } else {
                return false; // Invalid credentials
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Connection Failed: " + e.getMessage());
            return false;
        }
    }
}
