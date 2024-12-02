import java.sql.*;

public class p47 {
    public static void main(String[] args){
        System.out.println("Name : Sameer");
        System.out.println("Class : M.Sc(IT) - 3rdSem\n");
    
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sameer", "sameer");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
	        System.out.println("Table Contents : ");
	        while(rs.next()){
		        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
	        }

            stmt.executeQuery("update emp set name = 'mamta' where id = 101");
            System.out.println("Updates Table Contents : ");
            ResultSet rs1 = stmt.executeQuery("select * from emp");
            while (rs1.next()) {
                System.out.println(rs1.getInt(1) + " " + rs1.getString(2) + " " + rs1.getInt(3));
            }

            con.close();
        }
        catch(Exception e){
            System.out.println("Error : " + e);
        }

    }
}
