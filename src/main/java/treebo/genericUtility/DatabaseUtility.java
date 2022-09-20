package treebo.genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {
	private Connection connection;
	public List<String> getDataFromDatabase(String query,String coloumnName) throws SQLException  {
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(query);
		List<String> list=new ArrayList<>();
		while(result.next()) {
			list.add(result.getString(coloumnName));
		}
		return list;

	}
	public void openDbConnection(String dbURL,String dbUsername,String dbPassword) throws SQLException {
		Driver dbdriver=new Driver();
		DriverManager.registerDriver(dbdriver);
		connection = DriverManager.getConnection(dbURL,dbUsername , dbPassword);
	}
	public void closeDb() throws SQLException {
		connection.close();
	}
}
