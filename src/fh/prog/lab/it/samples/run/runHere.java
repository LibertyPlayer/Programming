/**
 * 
 */
package fh.prog.lab.it.samples.run;

import java.sql.SQLException;

import fh.prog.lab.it.samples.dbServices.DBServicesInvoker;

/**
 * @author metin z.
 *
 */
public class runHere {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		DBServicesInvoker dbService = new DBServicesInvoker();
		try {
			
			dbService.getDB();
		}catch (SQLException sqlex) {
			
			System.out.println("SQL Error : " + sqlex.getMessage());
		}  catch (Exception e) {
			
			System.out.println("SQL Error : " + e.getMessage());
		}
		
		
		//Start
		DBServicesInvoker dbService1 = new DBServicesInvoker();
		try {
			dbService1.setsomething();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
		//Select für Location
		DBServicesInvoker dbService2 = new DBServicesInvoker();
		try {
			dbService2.selectLocation();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	 

}
