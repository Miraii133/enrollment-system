package exer1;
import java.sql.*;
public class Exer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
try {
    // db parameters
    String url       = "jdbc:mysql://localhost:3306/enrollmentsystem";
    String user      = "root";
    String password  = "AiHosh1no_135";
	
    // create a connection to the database
    
    conn = DriverManager.getConnection(url, user, password);
    Statement stmt = conn.createStatement();
    String query = "INSERT INTO Students VALUES ('2', 'Kurt', 'davao', 'IT', 'Male', '2nd')";
    stmt.executeUpdate(query);
}
 catch(SQLException e) {
   System.out.println(e.getMessage());
   e.printStackTrace();
}



    }
    
}
