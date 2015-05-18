/**
 * 
 */
package fh.prog.lab.it.samples.dbServices;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author NET
 *
 */
public class Select {

	/**
	 * 
	 */
	
	Statement stmt = null;
	ResultSet rs = null;
	Connection conn = null;
	
	public Select(Connection conn) {
		
		this.conn = conn;
	}

	public boolean doSelect(String table) throws SQLException{
		
		boolean success = false;
		int colCounter = 0;
		String query = "select * from " + table;
		
		this.stmt = conn.createStatement();
		this.rs = stmt.executeQuery(query);
		   
		ResultSetMetaData colInfo = rs.getMetaData();
		   
		colCounter = colInfo.getColumnCount();
		System.out.println("We Have " + colCounter + " columns in the DB.");
		System.out.println("--------------------------");
		
		while(this.rs.next()){
			
			System.out.println("The Name    : " + rs.getString(1));
			System.out.println("The Surname : " + rs.getString(2));
			System.out.println("The Id      : " + rs.getString(3));
			System.out.println("--------------------------");
		}
		return success;
		
	}
		
		
		//Neu
		public boolean doSelectLocation() throws SQLException{
			
			boolean success = false;
			int colCounter = 0;
			String query = "select * from " + "location";
			
			this.stmt = conn.createStatement();
			this.rs = stmt.executeQuery(query);
			   
			ResultSetMetaData colInfo = rs.getMetaData();
			   
			colCounter = colInfo.getColumnCount();
			System.out.println("We Have " + colCounter + " columns in the DB.");
			System.out.println("--------------------------");
			
			while(this.rs.next()){
				
				System.out.println("Company ID    : " + rs.getString(1));
				System.out.println("Location ID : " + rs.getString(2));
				System.out.println("PLZ      : " + rs.getString(3));
				System.out.println("Street      : " + rs.getString(4));
				System.out.println("PostOffice      : " + rs.getString(5));
				System.out.println("--------------------------");
			}
		
		
		return success;
		
	}
	
	public boolean closeDB(){
		
		boolean success = false;
		
		try {
			
			this.stmt.close();
			this.rs.close();
			this.conn.close();
			success = true;
		} catch (SQLException e) {

			System.out.println("SQL Error : " + e.getMessage());
		}
		
		return success;
		
	}


}
