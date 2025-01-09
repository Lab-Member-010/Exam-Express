package ITEP;
import java.sql.*;
import javax.swing.*;
public class FatchData4 {
    public FatchData4(){
        fetchAndDisplayData();
    }
    public void fetchAndDisplayData() {
        try {
            Conn c = new Conn();
            
            
            String query = "SELECT id, name FROM createclass";
            PreparedStatement pstmt = c.c.prepareStatement(query);
            
            
            ResultSet rs = pstmt.executeQuery();
            
           
            StringBuilder allData = new StringBuilder();
            
           
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                
                
                allData.append("ID: ").append(id).append(", Name: ").append(name).append("\n");
            }
            
           DisplayDataClass ob=new DisplayDataClass();
            ob.DisplayDataClass(allData.toString());
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error while fetching data: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        new FatchData4().fetchAndDisplayData();
        
    }
}
