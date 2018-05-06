package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExtractingTickets {
	
	
	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		
	
					
			
		/*	String sql_stmt = "SELECT a.Name" + 
					"FROM student a" + 
					"LEFT JOIN registration b ON a.Name = b.Name" + 
					"WHERE registration.Name IS NULL ";
		
			*/
		//differenciation of data from two tables
		
		
		/*	String extract="SELECT * FROM registration T2"+
					"WHERE NOT EXISTS"+
					"(SELECT * FROM student T1 WHERE T1.Name = T2.Name)"; */
		
		
	/*	String extract="SELECT student.*" + 
				"FROM student" + 
				"    LEFT JOIN B ON (student.Name = registration.Name)" + 
				"WHERE registration.Name IS NULL";
			*/
		
		/* String extract="from student" + 
				"where (Name,date,?) not in" + 
				"   (select Name,date,? from registration)" + 
				"   union all " + 
				"select * from registration" + 
				"where (Name,date,?) not in" + 
				"   (select Name,date,? from student);"; */
		
		String extract="SELECT Name, date,  FROM student" + 
				"EXCEPT" + 
				"SELECT Name, date,  FROM registration";
			
			
			
			
			
			
			//past the data into the got datas
			String addData="INSERT INTO registration("+"Name," + "date," + "requested,)"+ "VALUES(?,?,?)";
			//System.out.println(extract);
	        
			 DB_Connection db=new DB_Connection();
		        
		        Connection connection=db.getConn();
		        System.out.println(connection);
		        
		        Statement statement = connection.createStatement(
		                ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		        System.out.println(statement+" chance");
				//Statement statement = connection.createStatement();
				 
		      //  PreparedStatement pstmt = connection.prepareStatement(addData);
	          //   System.out.println(pstmt);
	             
	             ResultSet rs = statement.executeQuery(extract);
	             System.out.println("resultset");
	             while (rs.next()) {
	               String name = rs.getString(2);
	               String date = rs.getString(3);
	               String requested = rs.getString(4);
	               
	               System.out.println(name+" "+date);
	           /*    pstmt.setString(1,name);
	               pstmt.setString(2, date);
	               pstmt.setString(3, requested);
	               
	               pstmt.executeUpdate();*/
	               System.out.println("student table has successfully droped");
	             }
	             connection.close();
	             
	           }
	         

		        
		        
		       
	}


