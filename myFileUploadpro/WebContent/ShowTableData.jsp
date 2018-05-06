<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="database.DB_Connection" %>
<html>
<head>
<script language="javascript">
function editRecord(id){
    var f=document.form;
    f.method="post";
    f.action='TicketsEdit.jsp?id='+id;
    f.submit();
}
</script>
</head>
<body>

<br><br>
<form method="post" name="form">
<table border="1">
<tr><th>Name</th><th>Address</th><th>Contact No</th><th>Edit</th></tr>
<%

DB_Connection DBConnection=new DB_Connection();

Connection con = DBConnection.getConn();
/*String url = "jdbc:mysql://localhost:3306/";
String db = "test";
String driver = "com.mysql.jdbc.Driver";
String userName ="root";
String password="root";

int sumcount=0;
Statement st;
try{
Class.forName(driver).newInstance();
con = DriverManager.getConnection(url+db,userName,password);*/

int sumcount=0;
try{
String query = "select * from student";
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(query);
%>
<%
while(rs.next()){
%>
<tr><td><%=rs.getString(1)%></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td>

<td><input type="button" name="edit" value="Edit" style="background-color:green;font-weight:bold;color:white;" onclick="editRecord(<%=rs.getString(4)%>);" ></td>
</tr>
<%
}
%>
<%
}
catch(Exception e){
e.printStackTrace();
}
%>
</table>
</form>
</body>
</html>