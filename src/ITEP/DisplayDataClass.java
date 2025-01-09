package ITEP;
import javax.swing.*;
import java.awt.*;

public class DisplayDataClass extends JFrame {
    private JPanel panel;
    public DisplayDataClass(){
        
    }
    public void DisplayDataClass(String allData) {
        setTitle("User Details");
        setSize(690, 310);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        
        String[] lines = allData.split("\n");
        for (String line : lines) {
            JLabel label = new JLabel(line);
            label.setAlignmentX(Component.LEFT_ALIGNMENT);
            panel.add(label);
        }

       
        JScrollPane scrollPane = new JScrollPane(panel);
        add(scrollPane);

        setVisible(true);
    }
}

