package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	
	
	
	public void createTableDynamically() throws SQLException {
		
		
		
		String sql_stmt = "DROP TABLE IF EXISTS student ";
		
		System.out.println(sql_stmt);
        
		 DB_Connection db=new DB_Connection();
	        
	        Connection connection=db.getConn();
	        System.out.println(connection);
			Statement statement = connection.createStatement();
             System.out.println(statement);
	        statement.executeUpdate(sql_stmt);
	        System.out.println("student table has successfully droped");
	        
	/*     String sql_stmt1 = "CREATE TABLE IF NOT EXISTS  aveksa.'student'(\n"
        		+ " 'Name'  VARCHAR(45)  NOT NULL ,\n"
        		+" 'date' VARCHAR(45)  NOT NULL ,\n"
        		+ " 'requested' VARCHAR(45)  NOT NULL ,\n"        		    		
        		+");";
        */
	        String sql_stmt1="CREATE TABLE IF NOT EXISTS student " +
	                   "(Name VARCHAR(255), " + 
	                   " date VARCHAR(255), " + 
	                   " requested VARCHAR(255), " + 
	                   " PRIMARY KEY ( Name ))";
        System.out.println(sql_stmt1);
        statement.executeUpdate(sql_stmt1);
        
       

        System.out.println("student has successfully been created");
                
    }
		
	}
