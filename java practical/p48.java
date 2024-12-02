import java.sql.*;

public class p48 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        try {
            // Load the JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Establish a connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sameer", "sameer");

            // Get database metadata
            DatabaseMetaData dbMetaData = con.getMetaData();
            System.out.println("Database Product Name: " + dbMetaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbMetaData.getDatabaseProductVersion());
            System.out.println("Driver Name: " + dbMetaData.getDriverName());
            System.out.println("Driver Version: " + dbMetaData.getDriverVersion());
            System.out.println("Max Connections: " + dbMetaData.getMaxConnections());

            // Create a statement and execute a query to retrieve data
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM emp");

            // Get result set metadata
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int columnCount = rsMetaData.getColumnCount();
            System.out.println("\nResultSet Metadata:");
            System.out.println("Number of Columns: " + columnCount);
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Column " + i + ": " + rsMetaData.getColumnName(i) + " (" + rsMetaData.getColumnTypeName(i) + ")");
            }

            // Close resources
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}