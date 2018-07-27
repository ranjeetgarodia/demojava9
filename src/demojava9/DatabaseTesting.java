package demojava9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DatabaseTesting {

	Connection con;

	@Test
	public void TestCase_dbconnection() throws SQLException {
		String host = "localhost";
		String port = "3306";

		// "jdbc:mysql://"+host+":"+3306 +"/qadb";

		con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadb", "root", "admin123");
		Statement stmt = con.createStatement();

		// ResultSet record=stmt.executeQuery("select * from employeeinfo where id=3 ");
		ResultSet record = stmt.executeQuery("select * from employeeinfo ");

		while (record.next()) {
			System.out.println("name:" + record.getString("name"));
			System.out.println("::" + record.getString(1));
			System.out.println("::" + record.getString(2));
		}

	}

	@AfterMethod
	public void closeconnection() throws SQLException {
		con.close();
		System.out.println("connection closed");
	}

}
