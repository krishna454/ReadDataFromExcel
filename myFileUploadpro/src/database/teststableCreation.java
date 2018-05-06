package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class teststableCreation {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		
	
			
			
			
			String sql_stmt = "DROP TABLE IF EXISTS REGISTRATION ";
		
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
		        String sql_stmt1="CREATE TABLE IF NOT EXISTS REGISTRATION " +
		                   "(id INTEGER not NULL, " +
		                   " first VARCHAR(255), " + 
		                   " last VARCHAR(255), " + 
		                   " age INTEGER, " + 
		                   " PRIMARY KEY ( id ))";
	        System.out.println(sql_stmt1);
	        statement.executeUpdate(sql_stmt1);
	        
	       

	        System.out.println("student has successfully been created");
	        
	    }
	}

