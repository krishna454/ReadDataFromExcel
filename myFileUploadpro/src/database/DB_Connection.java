package database;


	 import java.sql.Connection;  
	 import java.sql.DriverManager;

import java.sql.SQLException;  
	 public class DB_Connection {  
	   private Connection con;  
	    public DB_Connection()  
	   {  
	          try  
	         {  
	               String conUrl="jdbc:mysql://localhost:3306/aveksa";  
	               String userName="root";  
	               String pass="root";  
	               Class.forName("com.mysql.jdbc.Driver");  
	                 con=DriverManager.getConnection(conUrl,userName,pass);  
	                 
	                 System.out.println("connection  "+con);
	         }  
	         catch(SQLException s)  
	         {  
	             System.out.println(s);  
	         }  
	         catch(ClassNotFoundException c)  
	         {  
	              System.out.println(c);  
	         }  
	   }  
	   public Connection getConn() {  
	     return con;  
	   }  
	   public void setConn(Connection con) {  
	     this.con = con;  
	   }  
	 }  
