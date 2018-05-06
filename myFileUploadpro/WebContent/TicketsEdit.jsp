<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page language="java"%>
<%@page import="java.sql.*"%>
<%@ page import="database.DB_Connection" %>
<form method="post" action="update.jsp">
<table border="1">
<tr><th>Name</th><th>Address</th><th>Contact No</th></tr>
<%
String id=request.getParameter("id");
int no=Integer.parseInt(id);
int sumcount=0;
try {
/*	
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");*/
DB_Connection DBConnection=new DB_Connection();

Connection conn = DBConnection.getConn();

String query = "select * from student where id='"+id+"'";
System.out.println(query);
Statement st = conn.createStatement();
ResultSet rs = st.executeQuery(query);
while(rs.next()){
%>
<tr>
<td><input type="text" name="name" value="<%=rs.getString("name")%>"></td>
<td><input type="text" name="address" value="<%=rs.getString("date")%>"></td>
<td><input type="text" name="email" value="<%=rs.getString("requested")%>"></td>
 <td><input type="hidden" name="id" value="<%=rs.getString(4)%>"></td> 
</tr>
<tr>
<td><input type="submit" name="Submit" value="Update" style="background-color:#49743D;font-weight:bold;color:#ffffff;"></td>
</tr>
<%
}
}
catch(Exception e){}
%>
</table>
</form>