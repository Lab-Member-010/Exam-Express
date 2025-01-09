/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITEP;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author mohit
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mohit
 */




public class DisplayData2 extends JFrame {
    JLabel l1, l2;

    public DisplayData2(String name, String status) {
        setTitle("User Details");
        setSize(690, 310);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        l1 = new JLabel("Name: " + name);
        l2 = new JLabel("Status: " + status);
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(l1);
        add(l2);

        setVisible(true);
    }
}


    

