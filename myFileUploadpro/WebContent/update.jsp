<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.sql.*"%>
<%@ page import="database.DB_Connection" %>
<%
String ide=request.getParameter("id");
int num=Integer.parseInt(ide);
String name=request.getParameter("name");
String address=request.getParameter("address");
String email=request.getParameter("email");
try{
/*Connection conn = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "root");*/
DB_Connection DBConnection=new DB_Connection();

Connection conn = DBConnection.getConn();

Statement st=null;
st=conn.createStatement();
st.executeUpdate("update student set Name='"+name+"',date='"+address+"',requested='"+email+"' where id='"+num+"'");
response.sendRedirect("ShowTableData.jsp");
}
catch(Exception e){
System.out.println(e);
}
%>