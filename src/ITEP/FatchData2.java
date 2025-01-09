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
public class FatchData2 {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mohit
 */

    
    
    public void fetchAndDisplayData(JTextField j1) {
    try {
        
        Conn c = new Conn();
        int id = Integer.parseInt(j1.getText());
        
        
        String query = "SELECT name, status FROM   interviewresult WHERE id = ?";
        PreparedStatement pstmt = c.c.prepareStatement(query);
        pstmt.setInt(1, id); 
        
       
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) {
            
            String name = rs.getString("name");
            String status = rs.getString("status");
            
           // System.out.println(name);
            //System.out.println(status);
            new DisplayData(name, status);
        } else {
            JOptionPane.showMessageDialog(j1, "No user found with the given ID.");
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(j1, "Error while fetching data: " + e.getMessage());
    }
}

    
}

    

