package dbconnectivity;

public class DBConnectivity {
	
	/*
	 * JDBC :: 5 steps 
	 * 
	 * 1. Register with database driver class
	 * 		Class.forName("");
	 * Oracle :: oracle.jdbc.driver.OracleDriver
	 * MySQL :: com.mysql.jdbc.Driver
	 * 
	 * 2. get connection with
	 * 		Connection con = DriverManager.getConnection(url, username, paswword);	
	 * 
	 * url :: username@/hostname:port/servicename
	 * oracle db url :: hr@/localhost:1521/orclpdb
	 * username :: hr
	 * password :: hr
	 * 
	 * Mysql ::
	 * String url = "jdbc:mysql://localhost:3306/mysql";
		String userName = "root";
		String password = "root";
	 * 
	 * 3. Create a statement 
	 * 		Statement stmt = con.createStatement();
	 * 
	 * 4. execute query
	 * 		ResultSet rs = stmt.executeQuery(sqlquery);
	 * 
	 * 		while(rs.){
	 * 
	 * 		}
	 * 
	 * 5. close db connection
	 * 		con.close();
	 *  	
	 *  
	 */
	
	

}
