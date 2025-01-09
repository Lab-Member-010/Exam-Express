/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITEP;
import javax.swing.*;
import java.sql.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author mohit
 */
public class FatchData3 {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mohit
 */

    
    
    public void fetchAndDisplayData(JTextField j2) {
    try {
        
        Conn c = new Conn();
        int id = Integer.parseInt(j2.getText());
        
        
        String query = "SELECT name, status FROM  finalist WHERE id = ?";
        PreparedStatement pstmt = c.c.prepareStatement(query);
        pstmt.setInt(1, id); 
        
       
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) {
            
            String name = rs.getString("name");
            String status = rs.getString("status");
            
            
            new DisplayData2(name, status);
        } else {
            JOptionPane.showMessageDialog(j2, "No user found with the given ID.");
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(j2, "Error while fetching data: " + e.getMessage());
    }
}

    
}

    

