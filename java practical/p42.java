import java.sql.*;

public class p42 {
    public static void main(String[] args){
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
    
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sameer", "sameer");

            System.out.println("Connection establish successfully");
            con.close();
        }
        catch(Exception e){
            System.out.println("Error : " + e);
        }

    }
}
