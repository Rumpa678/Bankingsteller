package jdbcauto;
import java.sql.*;
public class Jdbcscript {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/sakila";
		String un="root";
		String pwd="root";
		String query="select* from sakila.actor";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,un,pwd);
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery(query);
		res.next();
		String data=res.getString(1);
		String data1=res.getString(2);
		System.out.println(data+"  "+data1);
		con.close();
		// TODO Auto-generated method stub,un.pwd

	}

}
