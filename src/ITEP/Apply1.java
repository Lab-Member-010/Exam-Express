package ITEP;

import java.sql.*;
import javax.swing.*;

public class Apply1 {

    public Apply1() {}

    public void apply1(JTextField t1, JTextField t2, JTextField t3, JTextField t4, JTextField t5) {

        if (t1.getText().trim().isEmpty() || t2.getText().trim().isEmpty() || t3.getText().trim().isEmpty()
                || t4.getText().trim().isEmpty() || t5.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(t1, "Please Enter Your Details");
        } else {
            String name = t1.getText();
            String email = t2.getText();
            String qualification = t3.getText();
            String income = t4.getText();
            String contact = t5.getText();
            
           try{
            
            Conn1 c = new Conn1();
            
            String query;
                query = "SELECT UserId  FROM user WHERE Email = ?";
                
           
        
            PreparedStatement pst = c.c.prepareStatement(query);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                //JOptionPane.showMessageDialog(t2,);
               
                
               
            }
           }
            catch(Exception e){  
                    System.out.println("nhi huwa");
                    }
            
            try {
                Conn c = new Conn();

                
                String checkQuery = "SELECT * FROM apply WHERE email = ?";
                PreparedStatement ps = c.c.prepareStatement(checkQuery);
                ps.setString(1, email);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(t1, "User already exists with this Email.");
                } else {
                    
                    String query = "INSERT INTO apply(name, email, qualification, income, contact) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement pstmt = c.c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                    pstmt.setString(1, name);
                    pstmt.setString(2, email);
                    pstmt.setString(3, qualification);
                    pstmt.setString(4, income);
                    pstmt.setString(5, contact);
                    pstmt.executeUpdate();

                    
                    ResultSet generatedKeys = pstmt.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        long id = generatedKeys.getLong(1);
                        JOptionPane.showMessageDialog(t1, "Registration Successful! Your Roll No: " + id);
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(t1, "Error during registration. Please try again.");
            }
        }
    }
}
