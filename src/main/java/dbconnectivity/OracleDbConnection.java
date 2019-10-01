package dbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDbConnection {

	Connection connection;

	String oracleDriver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521/orclpdb";
	String userName = "hr";
	String password = "hr";

	String query = "Select * from Countries";

	Connection dBConnection() {
		try {
			Class.forName(oracleDriver);
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	void getCountries() {
		try {
			connection = dBConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				if(rs.getString(1).equals("IN")) {
					System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


	public static void main(String args[]) {
		OracleDbConnection obj = new OracleDbConnection();
		//obj.dBConnection();
		obj.getCountries();
	}



}