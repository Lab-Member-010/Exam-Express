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


import javax.swing.*;

public class DisplayData extends JFrame {
    JLabel l1, l2;

    public DisplayData(String name, String marks) {
        setTitle("User Details");
        setSize(690, 310);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        l1 = new JLabel("Name: " + name);
        l2 = new JLabel("Marks: " + marks);
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(l1);
        add(l2);

        setVisible(true);
    }
}

