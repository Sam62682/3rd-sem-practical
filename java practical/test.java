import java.sql.*;

class text {
    public static void main(String[] args) {
        try {
            // Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            // Establish the connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sameer", "sameer");
            
            // Create a statement
            Statement stmt = con.createStatement();
            
            // Execute the SQL statement to create the table
            stmt.executeUpdate("CREATE TABLE prsu (id VARCHAR(20), name VARCHAR(20))");
            
            System.out.println("Table created successfully!");
            
            // Close the connection
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
