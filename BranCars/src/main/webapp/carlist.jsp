<%@page import="com.beans.UserBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">

<tr><th>Bank Id</th>
<th>Bank Name</th><th>IFSC</th><th>Address</th>
</tr>
<%
	ArrayList<UserBean> al=(ArrayList)request.getAttribute("carlist");


	Iterator<UserBean> i=al.iterator();
	while(i.hasNext()){
		UserBean u=i.next();
		%>
	<tr>
	
	
	
	
	             <td><%=u.getCar_id() %></td>
	              <td><%=u.getCarname()%></td>
	              <td><%=u.getCarcolour()%></td>
	              <td><%=u.getCost()%></td>
	             
	
	
	
	
	
	<%-- 
						<td><%=u.getcar_Id() %></td>
							<td><%=u.getcarname() %></td>
							<td><%=u.getcarmodel() %></td>
							<td><%=u.getcarcolour() %></td>
							<td><%=u.getcarcost() %></td>
							<td><%=u.getquantity() %></td>
							<td><%=u.getbrand_id %></td>
						 --%>

						</tr>
	<% }
	%>

<a href="AdminHome.jsp">Back</a>
</table>







</body>
</html>