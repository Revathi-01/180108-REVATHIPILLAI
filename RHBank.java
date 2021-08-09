package jdbcproject;
import java.sql.*;
import java.util.Scanner;

public class RHBank extends database1 {
		  
	public static void main(String args[]) throws SQLException{
		System.out.println("................................WELCOME TO RHBANK!!!!.....................................");
		String URL="jdbc:mysql://localhost:3306";
		String USER="root";
		String PASS="root";

		Connection con=DriverManager.getConnection(URL,USER,PASS);
		Statement st=con.createStatement();
		
		
		/*RHBank obj=new RHBank();
		obj.createdb(con,st);*/
		/*RHBank obj1=new RHBank();
		obj1.createtable(con, st);*/
		RHBank obj4=new RHBank();
		obj4.show(con, st);
		//RHBank obj2=new RHBank();
		//obj2.insert1(con, st);
		//RHBank obj3=new RHBank();
		//obj3.display1(con, st);
		
		}
}
