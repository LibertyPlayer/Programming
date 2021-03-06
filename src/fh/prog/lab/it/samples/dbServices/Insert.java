/**
 * 
 */
package fh.prog.lab.it.samples.dbServices;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author NET
 *
 */
public class Insert {

	/**
	 * 
	 */
	Statement stmt = null;
	Connection conn = null;
	
	public Insert(Connection conn) {
		
		this.conn = conn;
	}

	public void doInsert(String table) throws SQLException{
		
		boolean success = false;
		
		String query = "INSERT INTO " + table + "(Company_Name) VALUES('Keine Ahnung von nichts GmbH')";
		String query2 = "INSERT INTO " + table + "(Company_Name) VALUES('Nils stinkt GmbH')";
		String query3 = "INSERT INTO " + table + "(Company_Name) VALUES('Nils stinkt 2 GmbH')";
		
		this.stmt = this.conn.createStatement();
		this.stmt.executeUpdate(query);
		
	}
	public boolean closeDB(){
		
		boolean success = false;
		
		try {
			
			this.stmt.close();
			this.conn.close();
			success = true;
		} catch (SQLException e) {

			System.out.println("SQL Error : " + e.getMessage());
		}
		
		return success;
		
	}

}
