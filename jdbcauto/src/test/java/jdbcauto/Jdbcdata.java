package jdbcauto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Jdbcdata {

	public static void main(String[] args) throws SQLException {
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss","root","root");
		Statement statement=connection.createStatement();
		String Query="insert into product values('5','cloths','5000')";
		int result=statement.executeUpdate(Query);
		if(result==1) {
			System.out.println("data is added");
			
		}
		else {
			System.out.println("data is not added");
		}

	}
		// TODO Auto-generated method stub

	}


