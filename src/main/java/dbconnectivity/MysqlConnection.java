package dbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class MysqlConnection {

	Connection connection;
	
	String mySqlDriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/mysql";
	String userName = "root";
	String password = "root";
	
	String querry = "Select * from world.country";
	String querry1 = "Select * from world.city";// where CountryCode='IND' and District='Andhra Pradesh'";
	
	public Connection getDBConnection() {
		try {
			Class.forName(mySqlDriver);
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection success");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			throw new RuntimeException(ex);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return connection;
	}


	public void getCities() {

		try (Connection connection = getDBConnection();
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery(querry1)) {
				while (rs.next()) {
					if( rs.getString(3).equals("IND") && rs.getString(4).equals("Andhra Pradesh") ) {// && rs.getString(4).equals("Andhra Pradesh")) {
						System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
					}
				}
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
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
	
	public void getCountries() {

		try (Connection connection = getDBConnection();
				Statement stmt = connection.createStatement()) {
			try (ResultSet rs = stmt.executeQuery(querry)) {
				while (rs.next()) {
					if(rs.getString(1).equals("IND")) {
						System.out.println("We are reteiving details of the country :: "+rs.getString(2));
						System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+"  "+rs.getInt(7));
					}
				}
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
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
		MysqlConnection obj = new MysqlConnection();
		//obj.getDBConnection();
		obj.getCities();
		//obj.getCountries();

	}





}