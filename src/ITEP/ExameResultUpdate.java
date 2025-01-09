
package ITEP;




import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExameResultUpdate extends javax.swing.JFrame{
  public ExameResultUpdate(){
      main(null);
      
  }
    private static final String jdbcURL = "jdbc:mysql://localhost:3307/itep"; 
    private static final String username = "root"; // 
    private static final String password = "Tiger"; // 
    private static final String csvFilePath = "C:\\Users\\mohit\\Downloads\\resultdata.csv"; 
    private static final int batchSize = 20; 

    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Exame Result Update");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
         frame.setResizable(false);
        JButton insertButton = new JButton("Insert CSV Data");
        insertButton.setBounds(100, 70, 200, 30);

        insertButton.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                insertCsvDataIntoDb();
            }
        });

        
        frame.add(insertButton);

        
        frame.setVisible(true);
    }

    private static void insertCsvDataIntoDb() {
        Connection connection = null;
         try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
             //Conn c = new Conn();
            connection.setAutoCommit(false);
             String sql = "INSERT INTO  examresult (id, name, marks) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
            String lineText;
            int count = 0;
             lineReader.readLine();

             while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String id = data[0]; 
                String name = data[1]; 
                String marks = data[2]; 
                statement.setInt(1, Integer.parseInt(id)); 
                   statement.setString(2, name); 
                statement.setInt(3, Integer.parseInt(marks)); 

                statement.addBatch();

                if (++count % batchSize == 0) {
                    statement.executeBatch();
                }
            }

            lineReader.close();
            statement.executeBatch();
             connection.commit();
            JOptionPane.showMessageDialog(null, "Data inserted successfully!");
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error reading the file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();

            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

