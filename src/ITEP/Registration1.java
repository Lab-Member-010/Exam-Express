package ITEP;

import java.sql.*;
import javax.swing.JOptionPane;

public class Registration1{
    
    // Method to check if the user already exists
    public boolean checkUserExists(String username) {
        try {
            Conn c = new Conn();  // Database connection class
            String checkQuery = "SELECT * FROM user WHERE Email = ?";
            PreparedStatement pst = c.c.prepareStatement(checkQuery);
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            
            return rs.next();  // If result exists, user exists
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error while checking user existence.");
            return false;
        }
    }
    
    // Method to register a new user
    public boolean registerUser(String name, String password, String email) {
        try {
            Conn c = new Conn();
            String query = "INSERT INTO user(Name, password, Email) VALUES (?, ?, ?)";
            PreparedStatement pst = c.c.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, password);
            pst.setString(3, email);
            pst.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error during registration.");
            return false;
        }
    }
}
