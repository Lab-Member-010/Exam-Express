/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITEP;

/**
 *
 * @author mohit
 */
import java.sql.*;
import javax.swing.*;
public class Conn1 {
    Connection c;
    Statement s;

    Conn1() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/itep", "root", "Tiger");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
        }
    }
}
