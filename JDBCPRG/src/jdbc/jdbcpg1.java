package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcpg1 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","latha123");
		
		Statement st=con.createStatement();
		//String query="create table student(id int primary key,sname varchar(20))";
		//String query1="insert into family values(1,'latha')";
		//String query2="insert into family values(2,'harshi')";
		//String query3="insert into family values(3,'yogi')";
	    //String query1="delete from family where id=1";
		//String query1="insert into family values(1,'latha')";
		String query1="update family set sname='charvi'where id=1";
		
		st.execute(query1);
		//System.out.println("table created");
		//System.out.println("deleted");
		//System.out.println("inserted");
		System.out.println("updated");
		

	}

}
