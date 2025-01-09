/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITEP;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author mohit
 */
public class FatchData1 {
    
    
    public void fetchAndDisplayData(JTextField j1) {
    try {
        
        Conn c = new Conn();
        int id = Integer.parseInt(j1.getText());
        
        
        String query = "SELECT name, marks FROM  examresult WHERE id = ?";
        PreparedStatement pstmt = c.c.prepareStatement(query);
        pstmt.setInt(1, id); 
        
       
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) {
            
            String name = rs.getString("name");
            String marks = rs.getString("marks");
            
            
            new DisplayData(name, marks);
        } else {
            JOptionPane.showMessageDialog(j1, "No user found with the given ID.");
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(j1, "Error while fetching data: " + e.getMessage());
    }
}

    
}
