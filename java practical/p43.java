import java.sql.*;

public class p43 {
    public static void main(String[] args){
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
    
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sameer", "sameer");
            Statement stmt = con.createStatement();
            stmt.executeQuery("Create table employee(emp_id varchar(20), emp_name varchar(20), age number, dept varchar(20))");
            System.out.println("Table Created Successfully");
            con.close();
        }
        catch(Exception e){
            System.out.println("Error : " + e);
        }

    }
}
