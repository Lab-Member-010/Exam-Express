package ITEP;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GetDate extends JFrame {
    private JTextArea dateDisplay;

    public GetDate() {
        setTitle("Get Date");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        dateDisplay = new JTextArea();
        dateDisplay.setEditable(false);
        dateDisplay.setText(loadDate());

        add(new JLabel("Date Set by Admin:"), BorderLayout.NORTH);
        add(new JScrollPane(dateDisplay), BorderLayout.CENTER);

        setVisible(true);
    }

    private String loadDate() {
        StringBuilder date = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("Examdate.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                date.append(line);
            }
        } catch (IOException e) {
            date.append("Error loading date: ").append(e.getMessage());
        }
        return date.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GetDate::new);
    }
}
