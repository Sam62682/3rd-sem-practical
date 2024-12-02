import java.sql.*;

public class p45 {
    public static void main(String[] args) {
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");

        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sameer", "sameer");
            stmt = con.createStatement();

            // Use single quotes for SQL string values
            stmt.executeUpdate("insert into emp values(101, 'Sameer', 100000)");
            stmt.executeUpdate("insert into emp values(102, 'Manish', 70000)");
            stmt.executeUpdate("insert into emp values(103, 'Ram', 60000)");
            stmt.executeUpdate("insert into emp values(104, 'Sneha', 110000)");
            stmt.executeUpdate("insert into emp values(105, 'Esha', 70000)");

            System.out.println("Data Inserted successfully");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e);
            }
        }
    }
}
