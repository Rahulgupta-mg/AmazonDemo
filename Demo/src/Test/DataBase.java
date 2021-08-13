package Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {

	public static void main(String[] args) throws Exception {
		
		
		String driverpath = ""; //Enter Sql server path here
		
		String localhost = "";  // Enter Server Name and Sql table here

		Class.forName(driverpath);
		
		Connection Con = DriverManager.getConnection(localhost,"","");		
		
		
		
		
		
	}

}
