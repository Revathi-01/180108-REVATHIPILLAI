package jdbcproject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class database1{
	
	/*void createdb(Connection con, Statement st) throws SQLException {

		String sql= "create database RHBank";
		st.executeUpdate(sql);
		
		System.out.println("............Database RHBank created successfully............");
	}*/
	
	/*void createtable(Connection con,Statement st) throws SQLException{
		String sql1 = "create table RHBank.customer_details" +
				"(id int not null auto_increment primary key, name varchar(45) not null, age int not null)";
		          st.executeUpdate(sql1);
		   System.out.println(".........Successfully created table customer_details for database RHBank.............");       

	}*/

	void insert1(Connection con,Statement st) throws SQLException {
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter you name: ");
		String name = sc.nextLine();
		System.out.println("Enter you age: ");
		int age = sc.nextInt();		
        if (age<18) {
			System.out.println("Not eligible to open an Account!");
		}
        else {
			String sql2 = "insert into RHBank.customer_details (name, age) values " + "( '" + name + " ',"+ age + ")";
			
			st.executeUpdate(sql2);
			
			System.out.println("******************************Your details has been recorded successfully!!*****************************");
			System.out.println("\n");
	      }
        System.out.println("**********************************Your Account Details*********************************");
        System.out.println(name+" "+age);
        System.out.println("\n");
        }
	
    void display1(Connection con,Statement st) throws SQLException {
    	System.out.println("............Accounts that have been created yet..........");
    String sql3="select * from RHBank.customer_details";
    ResultSet rs=st.executeQuery(sql3);
	while(rs.next())
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

    }
    void show(Connection con,Statement st) throws SQLException {
		char option='\0'; //initializing char value
		Scanner scanner=new Scanner(System.in);
		System.out.println("A. Create Your Account ");
		System.out.println("B. Show Account details");
		System.out.println("E. Exit:");
		do {
			System.out.println("*************************************************************");
			System.out.println("Enter Your Option here!!!");
			System.out.println("*************************************************************");
			option=scanner.next().charAt(0);
			System.out.println("\n");
			
		switch(option) { 
		
		case 'A':
			System.out.println("____________________________________________");
			insert1(con,st);    //void insert1() method
			System.out.println("\n");
			break;
		case 'B':
			System.out.println("____________________________________________");
			display1(con,st);    //void display1() method
			System.out.println("\n");
			break;
		case 'E':
			System.out.println("_____________________EXIT________________________");
			System.out.println("\n");
			break;
		default:
			System.out.println("Invalid Option!!! Please Enter Again!!!");
		}
			
		}
			
		while(option!='E')	;
		System.out.println("*****************THANK YOU FOR USING OUR SERVICES!! VISIT AGAIN!!******************");
	}
	
	
}

