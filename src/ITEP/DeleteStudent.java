package ITEP;

import java.sql.*;
import javax.swing.*;

public class DeleteStudent{
    Connection c;
    Statement s;

    DeleteStudent() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/itep", "root", "Tiger");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
        }
    }

    public void deleteRecord(JTextField t1, JTextField t2) {
        try {
            
             String name = t1.getText();
            int id = Integer.parseInt(t2.getText());
          

            String query = "DELETE FROM createclass WHERE id = ? AND name = ?";
            PreparedStatement pstmt = c.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Record deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "No record found with the given ID and Name.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error while deleting record: " + e.getMessage());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid ID format: " + e.getMessage());
        }
    }
}
