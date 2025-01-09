package ITEP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SetHouseVisitDate extends JFrame {
    private JTextField dateField;
    private JButton saveButton;
    private static final String DATE_FILE = "HouseVisitDate.txt";

    public SetHouseVisitDate() {
        setTitle("Set Date");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());
        dateField = new JTextField(10);
        dateField.setText(getCurrentDate());

        saveButton = new JButton("Save Date");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveDate(dateField.getText());
                dispose();
            }
        });

        add(new JLabel("Set Date (yyyy-MM-dd):"));
        add(dateField);
        add(saveButton);

        setVisible(true);
    }

    private String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }

    private void saveDate(String date) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATE_FILE))) {
            writer.write(date);
            JOptionPane.showMessageDialog(this, "Date saved successfully.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving date: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SetHouseVisitDate::new);
    }
}

