import java.sql.*;

public class p44 {
    public static void main(String[] args){
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
    
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sameer", "sameer");
	    Statement stmt = con.createStatement();
	    stmt.executeQuery("create table emp(id number, name varchar(20), salary number)");
            System.out.println("Table Created successfully");
	    // stmt.executeQuery("drop table emp");
	    System.out.println("Table Droped Successfully");
            con.close();
        }
        catch(Exception e){
            System.out.println("Error : " + e);
        }

    }
}
